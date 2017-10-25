# Kwic_project2 WriteUp

/* Questions */
What criteria did you use to decompose the first design?
What criteria did you use to decompose the second design?
Which design is more resilient to change? And why?
What would have to change in the first design/implementation if the file were changed out for a database?
What would have to change in the second design/implementation if the file were changed out for a database?
What would have to change in the first vs second design/implementation if we wanted to use a graphical user interface instead of the traditional console UI (System.out)?
Identify another change that may happen in the future, and how does design 1 compare to design 2 when it comes to impact of the change?
Which design/implementation is easier to understand?
Which design/implementation is better performing?
How does the principle of information hiding relate to all of this?

Michael Peterson
KWIC Analysis
IT372
10/25/2017


The first step taken in the decomposition of the KWIC index production system was to identify what the program functionality would consist of.  The second step was to break down each function into modulizations.  There are six modularizations: Launch (to run the programs), ReadFile (to read the file to test the programs), Output file (to print out to console or other for testing the programs), AlphaSort (to sort the read data alphabetically provided the data is English), and ShiftData (to shift the first word in each line of read data to the end of the line).  This design will be sharing read data between all programs.  After the handwritten design was being implanted in an IDE, and a conversation with another student I added a LineHandler program that is intended to manage the lines of data (simply passing the data to the corresponding classes as needed).  It occurred to me that before I implemented this program I had no existing way of managing the data short of just reading in a file and passing it down a chain of programs till it was output to the console.  The addition of this program also helps with product flexibility.  The intent is to change one module only, and not have to change multiple modules to implement any changes to the overall KWIC system.  I did find myself wanting to improve my initial design as I attempted to build the project.  As I began to build each class I kept seeing flaws in my initial design (hence why I ended up with one change – the LineHandler module).  I believe the result was working towards information hiding, a new concept to me but a very logical concept.

The second design used is your KWIC version 2.0 shared in class.  (I had spent too much time working on filling out functions striving for a compliable program.)  However, this did allow me to take an opportunity to read another design and compare the two designs.   
I want to say my initial design is more resilient to change than the version 2.0.  One big reason that stands out is flexibility.  My initial design was meant to have a class that did one thing, and one thing only.  That way implementation of the KWIC was readable, adaptable to growth without major code overhauls, and easier to manage.  In the version 2.0, the circular data shift and alphabetize of the data are both contained within the Main class.  In my recent studies of Clean Code and Code Design a program should do one thing only.  This program runs the KWIC system, shifts, alphabetizes, etc.  If an modification as done to implement another feature the potential for breaking the program is greater in my opinion, and would require more work to complete.
In the first design, if a programmer wanted to change a file input from a saved text file to reading a text file from a database, it would involve a change in the ReadFile module.   In the second design, the change would occur in the LINEIO module.  Both designs would not have a significant impact from reading from a database.

To add a GUI for the output of the data (assuming the GUI is written and added to the project) the first design would require a change in the OutPutFile module.  The idea behind this design is so that for whatever choice a programmer has for output, the only change that would need to happen would take place in this module and only this module.   In the second design, it appears the output of the data processed by the KWIC system is in the Main.  I would recommend both designs use a GUI output module and a console output module.  This would allow both programs to be flexible with their design and future design changes.

Another change that may happen with the KWIC system is with how data is alphabetized.  Both designs are based on the English language, and using another language that has a different character base could potentially be disastrous.  The first design would involve creating a new module for inputting that data format, and it would probably be best to create a second new module for converting that data to run on an English based version.  The second design however, I fear that it would require several changes to the existing modules to accommodate a different character set (language).  The second design is a very consolidating design however limits with separation of functions.

I prefer to read the first design, based on the layout being like a book – one chapter per subject (like a module has only one function).  The second design reminds me of a book that packs in several subjects into a couple chapters to streamline the process.  However, if the second design (book analogy here) was to add more material, it would appear disorganized and hard to follow the more additions were made.

I would like to think the first design out performs the second design based on each module performing one task.  Per a section of reading, the switching of modules in the first design could prove to be a slowdown in the performance category.  (Reference: “On the Criteria To Be Used in Decomposing Systems into Modules” by D.L. Parnas @ Carnegie-Mellon University on Page 1057 under Efficiency and Implementations)

The principal of Information Hiding relates to both designs and this assignment by reducing complexity of a system.  The idea as I understand it is to allow a system to change easily and locally (meaning one module for example).  The goal is to prevent major program or system modifications if a change is implemented to the initial design being built from.

