Pattern Password Generator  4/1/2019

In it's current configuration, this won't run sadly, but it has previously been shown to create basic "one string" passwords.
This works by randomly generating "Coordinates" which correspond to [z][y][x] indeces of a 3D array to be found in the "Keyboard" class.
The Z axis is for shifted vs standard characters to allow for both capital letters and symbols/special characters. 
The "`" key is a null character, and cannot be used in passwords. This was chosen because of its position on a standard UK QWERTY keyboard.
A RuleSet class has been created to allow for further customization of a desired password. Examples include "no repeat letters", "must contain a symbol",
"must contain a capital letter". This is useful for generating passwords which must match a desired level of security.

A position on the keyboard is chosen by generating a coordinate and a loop is started;

        Loop until chosen length is reached:
            Generate a number between 1-4 (0-3 technically), which correspond to up, right, down and left.
            Transform current "focus" or coordinate accordingly
            Verify new focus coordinate is valid (i.e not "`" or out of bounds)
            Check if we want to shift up
            Add new letter to existing string
        Print string

In future, I plan to be able to store passwords and copy them to clipboard to be pasted into other applications in a style similar to KeyPass.
Furthermore, a GUI will be created to make this a better experience for users. Rules in the ruleset are currently stored as booleans, and will be 
toggleable from a simple checkbox in a GUI menu. 

Future additions will allow for more than one stringed pattern added either linearly, or interwoven patterns. For example:

A standard "one string" pattern with length of 8 with repeat characters allowed;    ASdedCvb

A standard "two string" pattern with length of 16 with repeat characters allowed;   ASdedCvb olkmJU78
    The two strings are 8 characters in length, the first 8 remains the same for demonstration purposes, and the second 8 characters begin again from a
    different starting point and are combined together to create a single 16 character password, composed of two different patterns.

An interwoven password using the same characters would look like this;  AoSldkemdJCU7b8
    The first character from the first string, followed by the first of the second, followed by the second of the first etc etc