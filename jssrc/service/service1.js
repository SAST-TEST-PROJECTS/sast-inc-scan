const model1 = require('./../model/model1');
const model3 = require('./../model/model3');

exports.logInfoUserInput = (userInput) => {
    return model1.logInfoUserInput(userInput, 12);
};

exports.logDebugUserInput = (userInput) => {
    return model3.logDebugUserInput(userInput);
};