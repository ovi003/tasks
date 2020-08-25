const getSortedString = (word) => {
  return word.toLowerCase().split('').sort().toString();
};
const isAnagram = (word1, word2) => {
  const firstWord = getSortedString(word1);
  const secondWord = getSortedString(word2);
  firstWord === secondWord
    ? console.log(`${word1} and ${word2} are anagrams`)
    : console.log(`${word1} and ${word2} are not anagrams`);
};

isAnagram('bleat', 'table'); // Output: bleat and table are anagrams

isAnagram('eat', 'tar'); // Output: eat and tar are not anagrams
