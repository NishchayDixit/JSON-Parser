# JSON Parser in Java

This project is a custom-built JSON parser written in Java. It is designed to parse and validate JSON files, progressing step-by-step through increasingly complex JSON structures.

## 📁 Project Structure

```
.
├── src/
│   └── main/
│       └── parser/
│           ├── Main.java
│           ├── JsonParser.java
│           └── JsonParserTest.java
├── test/
│   ├── pass1.json
│   ├── fail1.json
│   └── ... (add more test files here)
├── out/                  # Compiled class files
├── build.sh              # Build and test script (for Git Bash / Linux / Mac)
└── README.md
```

## 🚀 Usage

### ✅ Build & Run with Git Bash (or Linux/Mac Terminal)

```bash
build.sh
```

This will:
- Compile Java source files into the `out/` directory.
- Run unit tests via `JsonParserTest`.
- Execute tests in the `test/` folder, checking for valid/invalid JSON files.

## 🧪 Test Files

You can place your JSON test files in the `test/` directory.

- Files named like `fail*.json` are expected to contain **invalid JSON**
- All others are assumed to be **valid JSON**

Example:

```json
// test/pass1.json
{
  "key": "value"
}

// test/fail1.json
{ invalid: json }
```

## ✅ Exit Codes

- `0`: All tests passed
- `1`: One or more tests failed

## 📚 Learning Resources

- [JSON Specification](https://www.json.org/json-en.html)
- [Dragon Book - Compilers](https://en.wikipedia.org/wiki/Compilers:_Principles,_Techniques,_and_Tools)

---

### 👨‍💻 Author

Nishchay – Built as part of a hands-on challenge to implement a full JSON parser from scratch.

---

### 📝 License

MIT License
