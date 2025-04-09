package parser;

public class JsonParserTest {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();

        assert parser.parse("{}") : "Should be valid";
        assert !parser.parse("{") : "Should be invalid";
        assert !parser.parse("[]") : "Should be invalid";

        System.out.println("All tests passed.");
    }
}
