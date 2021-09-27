// DID Reverse Integer with the help of JS, AS String support in JS is much better

// Also learnt new thing about comparing values based on HEXCODE for 2^31 and -2^31
function reverse(x: number): number {
    let reversed = parseInt(x.toString().split('').reverse().join('')) * Math.sign(x);

    // Comparing for overflow situation value greater than 2^31 and value less than -2^31
    return (reversed <= 0x7fffffff && reversed >= -0x80000000) ? reversed : 0;

};