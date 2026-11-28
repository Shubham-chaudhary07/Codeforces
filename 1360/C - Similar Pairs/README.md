<h2><a href="https://codeforces.com/contest/1360/problem/C" target="_blank" rel="noopener noreferrer">1360C — Similar Pairs</a></h2>

| | |
|---|---|
| **Difficulty** | 1100 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1360C](https://codeforces.com/contest/1360/problem/C) |

## Topics
`constructive algorithms` `graph matchings` `greedy` `sortings`

---

## Problem Statement

<div class="header"><div class="title">C. Similar Pairs</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>We call two numbers $$$x$$$ and $$$y$$$ <span class="tex-font-style-it">similar</span> if they have the same parity (the same remainder when divided by $$$2$$$), or if $$$|x-y|=1$$$. For example, in each of the pairs $$$(2, 6)$$$, $$$(4, 3)$$$, $$$(11, 7)$$$, the numbers are similar to each other, and in the pairs $$$(1, 4)$$$, $$$(3, 12)$$$, they are not.</p><p>You are given an array $$$a$$$ of $$$n$$$ ($$$n$$$ is even) positive integers. Check if there is such a partition of the array into pairs that each element of the array belongs to exactly one pair and the numbers in each pair are similar to each other.</p><p>For example, for the array $$$a = [11, 14, 16, 12]$$$, there is a partition into pairs $$$(11, 12)$$$ and $$$(14, 16)$$$. The numbers in the first pair are similar because they differ by one, and in the second pair because they are both even.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le 1000$$$) — the number of test cases. Then $$$t$$$ test cases follow.</p><p>Each test case consists of two lines.</p><p>The first line contains an <span class="tex-font-style-bf">even</span> positive integer $$$n$$$ ($$$2 \le n \le 50$$$) — length of array $$$a$$$.</p><p>The second line contains $$$n$$$ positive integers $$$a_1, a_2, \dots, a_n$$$ ($$$1 \le a_i \le 100$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case print:</p><ul> <li> <span class="tex-font-style-tt">YES</span> if the such a partition exists, </li><li> <span class="tex-font-style-tt">NO</span> otherwise. </li></ul><p>The letters in the words <span class="tex-font-style-tt">YES</span> and <span class="tex-font-style-tt">NO</span> can be displayed in any case.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0017779788277329067" id="id0016633910916473127" class="input-output-copier">Copy</div></div><pre id="id0017779788277329067">7
4
11 14 16 12
2
1 8
4
1 1 1 1
4
1 2 5 6
2
12 13
6
1 6 3 10 5 8
6
1 12 3 10 5 8
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0023572413770921596" id="id009246723431385586" class="input-output-copier">Copy</div></div><pre id="id0023572413770921596">YES
NO
YES
YES
YES
YES
NO
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>The first test case was explained in the statement.</p><p>In the second test case, the two given numbers are not similar.</p><p>In the third test case, any partition is suitable.</p></div>