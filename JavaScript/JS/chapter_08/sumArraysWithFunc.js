const sumArray = (list) => {
  let sum = 0;
  for (let num of list) {
    sum += num;
  }
  return sum; // 関数の結果を返す
};

let list1 = [5, 6, 10, 55, 4, 9];
let list2 = [5, 6, 11, 525, 4, 9];
let list3 = [5, 6, 133, 55, 4, 9];

console.log(sumArray(list1)); // 89
console.log(sumArray(list2)); // 560
console.log(sumArray(list3)); // 212
