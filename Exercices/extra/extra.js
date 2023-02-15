const toMap = ['🍔', '🍔', '🍔'];
const toFilter = ['🍟', '🍔', '🍟'];
const toFind = ['🍟', '🍔', '🍟'];
const toFindWithIndex = ['🍟', '🍔', '🍟'];
const toFill = ['🍔', '🍔', '🍔'];
const doSome = ['🍟', '🍔', '🍟'];
const doEvery = ['🍟', '🍔', '🍟'];

const toMapExpect = ['🍟', '🍟', '🍟'];
const toFilterExpect = ['🍟', '🍟'];
const toFindExpect = ['🍔'];
const toFindWithIndexExpect = 1;
const toFillExpect = ['🍔', '🍟', '🍟'];
const doSomeExpect = true;
const doEveryExpect = false;

/* --------------------------------------------- */

// TODO: appliquez les fonctions ici
const toMapResult = [];
const toFilterResult = [];
const toFindResult = [];
const toFindWithIndexResult = -1;
const toFillResult = [];
const doSomeResult = false;
const doEveryResult = false;

/* -------------------------------------------- */

const appendElements = (element, array) => {
  array.forEach((item) => {
    element.innerText += ' ' + item;
  });
};

const appendUniqueElement = (element, value) => {
  element.innerText += ' ' + value;
};

/**
 * map
 */
let mapParagraph = document.getElementById('map');
let mapExpectParagraph = document.getElementById('mapExpect');
let mapResultParagraph = document.getElementById('mapResult');

appendElements(mapParagraph, toMap);
appendElements(mapExpectParagraph, toMapExpect);
appendElements(mapResultParagraph, toMapResult);

console.log(toMapResult);

/**
 * filter
 */
let filterParagraph = document.getElementById('filter');
let filterExpectParagraph = document.getElementById('filterExpect');
let filterResultParagraph = document.getElementById('filterResult');

appendElements(filterParagraph, toFilter);
appendElements(filterExpectParagraph, toFilterExpect);
appendElements(filterResultParagraph, toFilterResult);

/**
 * find
 */
let findParagraph = document.getElementById('find');
let findExpectParagraph = document.getElementById('findExpect');
let findResultParagraph = document.getElementById('findResult');

appendElements(findParagraph, toFind);
appendElements(findExpectParagraph, toFindExpect);
appendElements(findResultParagraph, toFindResult);

/**
 * findIndex
 */
let findIndexParagraph = document.getElementById('findIndex');
let findIndexExpectParagraph = document.getElementById('findIndexExpect');
let findIndexResultParagraph = document.getElementById('findIndexResult');

appendElements(findIndexParagraph, toFindWithIndex);
appendUniqueElement(findIndexExpectParagraph, toFindWithIndexExpect);
appendUniqueElement(findIndexResultParagraph, toFindWithIndexResult);

/**
 * fill
 */
let fillParagraph = document.getElementById('fill');
let fillExpectParagraph = document.getElementById('fillExpect');
let fillResultParagraph = document.getElementById('fillResult');

appendElements(fillParagraph, toFill);
appendElements(fillExpectParagraph, toFillExpect);
appendElements(fillResultParagraph, toFillResult);

/**
 * some
 */
let someParagraph = document.getElementById('some');
let someExpectParagraph = document.getElementById('someExpect');
let someResultParagraph = document.getElementById('someResult');

appendElements(someParagraph, doSome);
appendUniqueElement(someExpectParagraph, doSomeExpect);
appendUniqueElement(someResultParagraph, doSomeResult);

/**
 * every
 */
let everyParagraph = document.getElementById('every');
let everyExpectParagraph = document.getElementById('everyExpect');
let everyResultParagraph = document.getElementById('everyResult');

appendElements(everyParagraph, doEvery);
appendUniqueElement(everyExpectParagraph, doEveryExpect);
appendUniqueElement(everyResultParagraph, doEveryResult);
