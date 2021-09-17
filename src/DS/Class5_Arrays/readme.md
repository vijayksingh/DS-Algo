## Arrays and Patterns

Topic Completed  
 - [ ] Binary Search
 - [ ] Two Pointers
 - [ ] Sliding Window

### Binary Search

Binary Search technique is a simple recursion technique to find a number in a sorted array.  
The concept is really simple you have an Array which you split into two regions, region where your target can exist  
and region where your target can not exist.  
In this way we keep reducing the search space into half until we run out of search space. 

#### Template for Binary Search
```python
int binary_search(array) {
    bool condition(value) {
        pass
    }
    
    left, right = min(search_space), max(search_space) # could be [0, n], [1, n] etc. Depends on problem
    while left < right:
        mid = left + (right - left) // 2
        if condition(mid):
            right = mid
        else:
            left = mid + 1
    return left
```

#### Patterns for Binary Search
 - [ ] Problems where its Difficult to figure out if Binary Search can be applied
 - [ ] 


### References
[Leetcode Discuss Binary Search Template](https://leetcode.com/discuss/study-guide/786126/Python-Powerful-Ultimate-Binary-Search-Template.-Solved-many-problems)  
[Binary Search for Beginners](https://leetcode.com/discuss/general-discussion/691825/Binary-Search-for-Beginners-Problems-or-Patterns-or-Sample-solutions)  
[Sliding Window for Beginners](https://leetcode.com/discuss/general-discussion/657507/sliding-window-for-beginners-problems-template-sample-solutions/562721)
