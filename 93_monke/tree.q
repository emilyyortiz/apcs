Emily Ortiz
APCS pd6
HW93: A Tree Grows in 251 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent:  0.5 hrs


DISCO
------------------------------------------------
* I discovered that I am not comfortable freely using tree vocabulary terms.
================================================


QCC
------------------------------------------------
* Who is the "Man Who Is Tall"?
* I need more familiarization with graph terminology.
* How is an In-Order traversal defined? Is it like bottom right to bottom left node? Something else?
* "A Tree Grows in 251" is a really cute homework title. It could be a book and it makes me smile because it sounds hopeful.
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
* A tree grows in kind of all directions.
* The trunk and branches grow up and out, and the roots grow down and out.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
* A "tree" is an undirected graph, where each cycle leads to a split path.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
* When traversing a tree, you check to see if there are two children.
* Having only one child is still considered balanced because you still check both the right and left branches.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
* A tree where the leaves either don't have siblings, or the siblings are also leaves.

Is a perfect tree complete?
* No, a perfect tree has all levels filled, but a complete tree has an unfilled bottom level.

Is a complete tree balanced?
* Yes, a complete tree is partially filled on the bottom, which fits within the 1 height difference allowed in a balanced tree.

Is the Man Who Is Tall Happy?
* I dunno. Is he?

What must be true of perfect trees but not others?
* Every level must be filled in a perfect tree.
================================================


C'EST POSSIBLE?
------------------------------------------------
< your explanation of whether the tree reconstruction challenge given in class is achievable or not >
* To construct a tree from the pre-order traversal, create a "line", or tree that goes down one branch. The root is E because that is the first node.
* For the in-order traversal, it might be possible. It depends on how an in-order traversal is defined, which I am unsure about. Using the same tree from before with one long branch, that could be in-order because you start at the "rightmost" or "leftmost" node technically. However, it goes against the basic rule for in-order traversals: the root should be in the middle.
================================================
