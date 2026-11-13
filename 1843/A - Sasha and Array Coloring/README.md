<h2><a href="https://codeforces.com/contest/1843/problem/A" target="_blank" rel="noopener noreferrer">1843A — Sasha and Array Coloring</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1843A](https://codeforces.com/contest/1843/problem/A) |

## Topics
`greedy` `sortings` `two pointers`

---

## Problem Statement

<div class="header"><div class="title">A. Sasha and Array Coloring</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Sasha found an array $$$a$$$ consisting of $$$n$$$ integers and asked you to paint elements.</p><p>You have to paint each element of the array. You can use as many colors as you want, but each element should be painted into exactly one color, and for each color, there should be at least one element of that color.</p><p>The <span class="tex-font-style-it">cost</span> of one color is the value of $$$\max(S) - \min(S)$$$, where $$$S$$$ is the sequence of elements of that color. The <span class="tex-font-style-it">cost</span> of the whole coloring is the <span class="tex-font-style-bf">sum</span> of costs over all colors.</p><p>For example, suppose you have an array $$$a = [\color{red}{1}, \color{red}{5}, \color{blue}{6}, \color{blue}{3}, \color{red}{4}]$$$, and you painted its elements into two colors as follows: elements on positions $$$1$$$, $$$2$$$ and $$$5$$$ have color $$$1$$$; elements on positions $$$3$$$ and $$$4$$$ have color $$$2$$$. Then:</p><ul> <li> the cost of the color $$$1$$$ is $$$\max([1, 5, 4]) - \min([1, 5, 4]) = 5 - 1 = 4$$$; </li><li> the cost of the color $$$2$$$ is $$$\max([6, 3]) - \min([6, 3]) = 6 - 3 = 3$$$; </li><li> the total cost of the coloring is $$$7$$$. </li></ul><p>For the given array $$$a$$$, you have to calculate the <span class="tex-font-style-bf">maximum</span> possible cost of the coloring.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains one integer $$$t$$$ ($$$1 \leq t \leq 1000$$$) — the number of test cases.</p><p>The first line of each test case contains a single integer $$$n$$$ ($$$1 \le n \le 50$$$) — length of $$$a$$$.</p><p>The second line contains $$$n$$$ integers $$$a_1, a_2, \dots, a_n$$$ ($$$1 \leq a_i \leq 50$$$) — array $$$a$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case output the maximum possible cost of the coloring.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id006630346684765329" id="id0018930491863827426" class="input-output-copier">Copy</div></div><pre data-content="6
5
1 5 6 3 4
1
5
4
1 6 3 9
6
1 13 9 3 7 2
4
2 2 2 2
5
4 5 2 2 3
" id="id006630346684765329"><div class="test-example-line test-example-line-even test-example-line-0">6</div><div class="test-example-line test-example-line-odd test-example-line-1">5</div><div class="test-example-line test-example-line-odd test-example-line-1">1 5 6 3 4</div><div class="test-example-line test-example-line-even test-example-line-2">1</div><div class="test-example-line test-example-line-even test-example-line-2">5</div><div class="test-example-line test-example-line-odd test-example-line-3">4</div><div class="test-example-line test-example-line-odd test-example-line-3">1 6 3 9</div><div class="test-example-line test-example-line-even test-example-line-4">6</div><div class="test-example-line test-example-line-even test-example-line-4">1 13 9 3 7 2</div><div class="test-example-line test-example-line-odd test-example-line-5">4</div><div class="test-example-line test-example-line-odd test-example-line-5">2 2 2 2</div><div class="test-example-line test-example-line-even test-example-line-6">5</div><div class="test-example-line test-example-line-even test-example-line-6">4 5 2 2 3</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0048091969791235056" id="id0030823080927355107" class="input-output-copier">Copy</div></div><pre id="id0048091969791235056">7
0
11
23
0
5
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first example one of the optimal coloring is $$$[\color{red}{1}, \color{red}{5}, \color{blue}{6}, \color{blue}{3}, \color{red}{4}]$$$. The answer is $$$(5 - 1) + (6 - 3) = 7$$$.</p><p>In the second example, the only possible coloring is $$$[\color{blue}{5}]$$$, for which the answer is $$$5 - 5 = 0$$$.</p><p>In the third example, the optimal coloring is $$$[\color{blue}{1}, \color{red}{6}, \color{red}{3}, \color{blue}{9}]$$$, the answer is $$$(9 - 1) + (6 - 3) = 11$$$. </p></div>