```groovy
def myMethod(List<String> list) {
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String item = iterator.next()
    println "Item: $item"
    if (item == "some_item") {
      iterator.remove()
    }
  }
}

List<String> myList = ['apple', 'banana', 'some_item', 'orange']
myMethod(myList)
```