# Temperature Converter Project

COMP 3520 Assignment 3 — Temperature Converter using Java, JUnit 5, Maven, Git, and GitHub.

## Open and run

1. In IntelliJ IDEA, choose **File → Open** and select this project folder (the folder containing `pom.xml`).
2. Set the project SDK to **JDK 21** if prompted. Wait for Maven to load the JUnit dependency.
3. Open `src/test/java/TemperatureConverterTest.java` and run the class with the green run icon.
4. To run through Maven, open IntelliJ's Terminal in the project folder and run `mvn test`. (If the `mvn` command is unavailable, use IntelliJ's Maven panel and run Lifecycle → test.)

## TDD evidence you must capture in IntelliJ

The source files here contain the final correct formulas. To demonstrate each Red–Green cycle honestly, temporarily change only the method you are working on to `return 0.0;`, run the corresponding test, and screenshot the failed result. Restore that method's correct formula, run its test again, and screenshot the passing result. Repeat for all three methods. Do not leave a stub or deliberate error in the final project.

For each Red and Green stage, use the IntelliJ test runner and capture the method's test plus its failure/pass result. Save screenshots and insert them in the matching labeled spaces in the report.

## Three deliberate-error experiments

Perform one change at a time. Run the tests without editing them, screenshot the failure and record expected vs. actual, then restore the correct expression and confirm all tests pass before starting the next experiment.

1. `celsiusToFahrenheit`: change `+ 32.0` to `- 32.0`. With input 0°C, expected 32.0°F; actual -32.0°F.
2. `fahrenheitToCelsius`: change `5.0 / 9.0` to `5 / 9`. With input 212°F, Java integer division makes `5 / 9` equal 0, so actual is 0.0°C instead of 100.0°C.
3. `celsiusToKelvin`: change `273.15` to `273.0`. With input 0°C, expected 273.15 K; actual 273.0 K.

## Git and GitHub

Create an empty GitHub repository named `TemperatureConverterProject` (do not add a README or `.gitignore` on GitHub). In IntelliJ's Terminal, from this project folder, run:

```bash
git init
git add .
git commit -m "Add Maven project and conversion tests"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/TemperatureConverterProject.git
git push -u origin main
```

Replace `YOUR_USERNAME` with your GitHub username and use the actual repository URL. For the assignment's TDD history, commit after each Red stage, each Green implementation, each refactor (or a short documented no-refactor decision), and each corrected error experiment. Push the commits to GitHub. Do not commit a broken final state. After pushing, open the repository's **Actions** tab and confirm the Maven workflow passes.

## Final checklist

- Correct conversion source and tests are committed.
- Six TDD screenshots (Red and Green for each method) are in the report.
- Three deliberate-error failure screenshots and actual results are in the report.
- Final IntelliJ all-tests-passing screenshot is in the report.
- Report includes student name(s), TRU ID(s), course/assignment, GitHub link, and a personalized 5–7 sentence reflection.
- GitHub Actions workflow `Java CI with Maven` passes.
