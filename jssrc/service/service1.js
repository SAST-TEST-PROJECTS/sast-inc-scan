const model1 = require('./../model/model1');
const model2 = require('./../model/model2');

let fruits = ["Apple", "Banana", "Orange"];

exports.logInfoUserInput = (userInput) => {
    // 2. Accessing elements
    console.log("First fruit:", fruits[0]); // Output: Apple
    console.log("Second fruit:", fruits[1]); // Output: Banana
    return model1.logInfoUserInput(userInput, 12);
};

exports.logDebugUserInput = (userInput) => {
    return model2.logDebugUserInput(userInput);
};