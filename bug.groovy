```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item $index: $item"
    if (item == "some_item") {
      list.remove(item) // This is the problematic line
    }
  }
}

List<String> myList = ['apple', 'banana', 'some_item', 'orange']
myMethod(myList)
```