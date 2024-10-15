let numbers = ['1', '2', '3', '4'];
let squares = numbers.map(x => x * x);  // Output: [1, 4, 9, 16]

squares

console.log(typeof squares)


function calculateTimeComponents(timestamp) {
    // Split the timestamp into hours, minutes, and seconds
    const [hours, minutes, seconds] = timestamp.split(':').map(Number);
    return { hours, minutes, seconds };
}

// Example usage
const timestamp = "01:10:10"; // 1 hour, 10 minutes, 10 seconds
const { hours, minutes, seconds } = calculateTimeComponents(timestamp);
console.log(`Hours: ${hours}, Minutes: ${minutes}, Seconds: ${seconds}`); 
// Output: Hours: 1, Minutes: 10, Seconds: 10


let a = [1,2,3];
let [b,c,d] = a
let {e,f,g} = calculateTimeComponents(timestamp);

console.log(b);
console.log(c);
console.log(d);

console.log(e);
console.log(f);
console.log(g);



