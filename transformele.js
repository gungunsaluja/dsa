https://leetcode.com/problems/apply-transform-over-each-element-in-array/?envType=study-plan-v2&envId=30-days-of-javascript


/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    return arr.map(fn);
    
};
function fn(x){
    return x+1;
}
