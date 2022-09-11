# mrstring
Convenient String methods to work with string.

## Requirements
* JDK 17
* Gradle 7+

## SetUp
* Clone **[mrstring](https://github.com/nareshdeeti/mrstring.git)**
* Run ```./gradlew clean build```
* Open in your favorite IDE

## Usage
1. To get array of String by delimiter \
    ``String src = "Yo,Ho,Ho,Ho;`` \
    ``String[] strings = StringUtils.toArray(src, ",")`` \
   this will return ``{"Yo","Ho","Ho","Ho"}``
