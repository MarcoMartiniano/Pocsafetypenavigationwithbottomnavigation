# Navigation with Jetpack Compose using safe type and with BottomNavigation
## This study aims to implement Type Safe Compose Navigation together with BottomNavigationBar.
## Below you can find the screens and different navigation scenarios.

HomeScreen
* Navigate to Home2: Navigate to HomeScreen2 with BottomNavigationBar visible.
* Navigate to Home3 without navBar: Navigate to HomeScreen3 with BottomNavigationBar NOT visible.
* Navigate to Home4 without navBar: Navigate and pass a string called 'name' to HomeScreen4 with BottomNavigationBar NOT visible.
* Navigate to Home5 without navBar: Navigate and pass an object User called 'user' to HomeScreen5 with BottomNavigationBar NOT visible.
* Navigate to Home6 without navBar: Navigate and pass an object User called 'user' to HomeScreen6 with BottomNavigationBar visible.
* Navigate to Quiz tab: Navigate(Switch) to QuizTab.

HomeScreen2
* Navigate back to Home: Navigate back to Home using popStack.
* Navigate to Home3 without navBar: Navigate to HomeScreen3 with BottomNavigationBar NOT visible.

HomeScreen3
* Navigate back to Home - Navigate back to Home using popStackBackInclusive.
* Navigate back to Home2 - Navigate back to Home2 using popStack.

QuizScreen
* Navigate to Quiz2 - Navigate to Quiz2 with BottomNavigationBar visible.

QuizScreen2 
* Navigate to Quiz3  - Navigate to Quiz3 with BottomNavigationBar NOT visible.
* Navigate back to Home  - Navigate back to Home using popStackBackInclusive.
* Navigate back to Home Switching tab - Navigate(Switch) to Home tab. *
* ATTENTION: *When you switch back to Home tab, if you navigate again to Quiz tab using Navigate to Quiz tab from HomeScreen, you wil navigate to QuizScreen2 because it is the top screen of Quiz graph.

* Steps: 
* 1- Switch to Quiz tab by clicking Quiz item in BottomNavigation.
* 2- Click button navigate to Quiz2
* 3- Click button Navigate to Home switching tabs.
* 4- Click button Navigate to Quiz tab.
Notice that you are in Screen2. If you want to back to Home clearing the stack, you should use popStackBackInclusive.

### If you find any bug, please let me know.
### If you find a better way to do this, please share with us.