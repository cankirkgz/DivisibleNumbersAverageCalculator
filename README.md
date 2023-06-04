<h1>Divisible Numbers Average Calculator</h1>

<p>This Java program calculates the average of numbers divisible by both 3 and 4 within a given range.</p>

<h2>Usage</h2>

<ol>
  <li>Make sure you have Java installed on your system.</li>
  <li>Clone this repository or download the source code.</li>
  <li>Open the code in your preferred Java development environment.</li>
  <li>Run the program.</li>
  <li>Enter a number when prompted.</li>
  <li>The program will calculate the average of numbers divisible by both 3 and 4 within the range from 0 to the entered number.</li>
  <li>The calculated average will be displayed as output.</li>
</ol>

<h2>How it Works</h2>

<ol>
  <li>The program prompts the user to enter a number.</li>
  <li>It uses a <code>Scanner</code> to read the user's input.</li>
  <li>It initializes variables for calculating the sum, count, and iteration.</li>
  <li>Using a <code>while</code> loop, it iterates from 0 to the entered number (inclusive).</li>
  <li>Within each iteration, it checks if the current number is divisible by both 3 and 4 using the modulo operator <code>%</code>.</li>
  <li>If the condition is met, it adds the number to the sum and increments the count.</li>
  <li>After the loop finishes, it checks if any numbers were found.</li>
  <li>If numbers were found, it calculates the average by dividing the sum by the count, considering the count as a <code>double</code>.</li>
  <li>The calculated average is then displayed as output.</li>
  <li>If no numbers were found, it displays a message indicating that no numbers divisible by both 3 and 4 were found.</li>
</ol>

<p>Feel free to modify the code according to your needs or integrate it into your own projects.</p>

<h2>Contributing</h2>

<p>Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.</p>

<h2>License</h2>

<p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>
