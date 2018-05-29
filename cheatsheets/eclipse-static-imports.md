# Eclipse Static Imports

You can set up Eclipse to suggest Hamcrest imports and other static imports for you so you don't have to type them out manually.

Go to: `Window` > `Preferences` > `Java` > `Editor` > `Content Assist` > `Favorites`

Click: `New Type...`

Follow the same process to add both of these types:
* org.hamcrest.Matchers
* org.hamcrest.CoreMatchers

You will notice `.*` appear after each type once it is added.

When you type "containsInAnyOrder" or another static Hamcrest method that you haven't imported yet, Eclipse will underline it in red as usual. However, if you move your mouse cursor over the underlined method name, Eclipse will now suggest that you add a static import for Hamcrest. Instead of typing out each import, you can just type the method and import it with a click.

Even faster, you can start typing the method (like "contai" for "containsInAnyOrder"), and press <kbd>CTRL</kbd> + <kbd>SPACE</kbd> to have Eclipse show you a list of autocomplete options. These options will contain the Hamcrest method you are typing, and when you select it Eclipse will automatically import it for you.
