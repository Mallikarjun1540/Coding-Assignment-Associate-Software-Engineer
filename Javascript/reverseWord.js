function reverseWords(sentence) {
    var words = sentence.split(' ');
    var reversedWords = words.map(function (word) {
        return reverseWord(word);
    });

    var reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}

var inputSentence = "This is a sunny day";
var reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); 
