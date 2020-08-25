const getSortedString = (word) => {
  return word.toLowerCase().split('').sort().toString();
};
const isAnagram = (word1, word2) => {
  const firstWord = getSortedString(word1);
  const secondWord = getSortedString(word2);
  firstWord === secondWord
    ? console.log(`${word1} and ${word2} are Anagrams`)
    : console.log(`${word1} and ${word2} are not Anagrams`);
};

isAnagram('Table', 'Bleat');
