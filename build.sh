echo "Compiling Java source files..."
mkdir -p out
javac -d out src/main/parser/*.java

echo ""
echo "Running JsonParserTest..."
java -cp out parser.JsonParserTest

echo ""
echo "Running JSON tests:"

fail_count=0
pass_count=0

for file in test/*.json; do
    echo -n "Testing $file ... "
    if java -cp out parser.Main "$file" > /dev/null 2>&1; then
        echo "FAILED (invalid JSON accepted)"
        ((fail_count++))
    else
        if [[ "$file" == test/fail*.json ]]; then
            echo "PASSED (invalid JSON detected)"
        else
            echo "FAILED (valid JSON rejected)"
        fi
        ((pass_count++))
    fi
done

echo ""
echo "Passed: $pass_count"
echo "Failed: $fail_count"

if [ $fail_count -eq 0 ]; then
    echo "All tests passed!"
else
    echo "Some tests failed."
fi

if [[ $- == *i* ]]; then
    echo ""
    read -p "Press ENTER to close..."
fi