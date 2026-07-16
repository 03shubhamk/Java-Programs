# Java GUI Programs Collection ☕

Welcome to the **Java GUI Programs Collection**! This repository is a curated collection of **28 Java applications and applets** built using Java's core graphical user interface (GUI) toolkits: **AWT (Abstract Window Toolkit)**, **Swing**, and **Applets**. 

These programs demonstrate fundamental desktop GUI concepts, graphics rendering, event-driven programming (action, adjustment, item, mouse, and key listeners), multi-window navigation, and data structure visualization.

---

## 🛠️ Key Technologies & Concepts
* **AWT (`java.awt.*`)**: Classic window components, layouts, and system events.
* **Swing (`javax.swing.*`)**: Lightweight, pluggable look-and-feel components (e.g., `JFrame`, `JTabbedPane`, `JTable`).
* **Applets (`java.applet.Applet`)**: Browser-embeddable GUI programs (runnable locally via `appletviewer`).
* **Event Listeners**: Extensive implementation of `ActionListener`, `MouseListener`, `MouseMotionListener`, `KeyListener`, and `AdjustmentListener`.

---

## 🗄️ Application Categories

### 🎮 1. Math & Logic Games
*   [AddGame.java](AddGame.java): A math game where the player clicks numbers on a keypad to make a sequence of values add up to a randomly generated target sum.
*   [ArithGame.java](ArithGame.java): An advanced Swing game using a tabbed panel interface. It features separate games for **Addition, Subtraction, Multiplication, and Division**, complete with custom keypads and random targets.
*   [Game1.java](Game1.java): A grid-based addition matching game similar to `AddGame`, using custom layouts.

### 🏗️ 2. Data Structure Visual Simulators
*   [MyStack.java](MyStack.java): An interactive GUI Stack simulator. Users can enter numbers to `PUSH` or click `POP` with visual stack representation in a central text panel, showing overflow/underflow messages.
*   [Queue.java](Queue.java): An interactive layout highlighting queue operations (`ENQUEUE` and `DEQUEUE`).

### 🎨 3. Color & Font Customization
*   [RGB.java](RGB.java): A classic color mixer featuring three scrollbars (Red, Green, Blue) that dynamically change the background color as you slide them.
*   [RGB2.java](RGB2.java): A design containing scrollbars and incremental adjustment buttons to fine-tune RGB colors.
*   [RGBText.java](RGBText.java): Controls the text coloring of elements dynamically based on user-entered color values.
*   [FontStyle.java](FontStyle.java): Allows selecting text font styles (bold, italic, plain) and size modifications dynamically.

### ⌨️ 4. Form Layouts & Validations
*   [RegisterDetail.java](RegisterDetail.java): A student/employee registration form layout containing Name, Father's Name, Gender radio buttons, Hobbies checkboxes, Course Selection, and text fields.
*   [Validate1.java](Validate1.java): Shows real-time keystroke validation. The first field restricts characters to **numeric values only**, and the second field restricts to **lowercase letters only**.
*   [Login.java](Login.java): A typical login form with text inputs for Username and Password.
*   [MenuBarDemo.java](MenuBarDemo.java): A window demonstrating menu elements (`MenuBar`, `Menu`, `MenuItem`). Users can perform basic math and relational operations via dropdown menu options.

### 🖱️ 5. Mouse & Graphics Event Tracking
*   [CursorClick.java](CursorClick.java): Captures mouse click events and prints the exact pixel coordinates $(x, y)$ of where the mouse was pressed.
*   [CursorMove.java](CursorMove.java): Dynamically tracks mouse movement coordinates in real-time.
*   [LineClick.java](LineClick.java): An interactive drawing canvas that draws geometric lines connecting mouse click locations.

---

## 📝 Detailed Program Directory

Below is the complete list of all 28 programs:

| Program File | Technology | Class Type | Description |
| :--- | :--- | :--- | :--- |
| **[AddGame.java](AddGame.java)** | Swing | `JFrame` | Number selection addition game targeting random sums. |
| **[Addition.java](Addition.java)** | AWT | `Frame` | Simple mathematical addition panel taking two inputs. |
| **[ArithGame.java](ArithGame.java)** | Swing | `JFrame` | Multi-tab mathematical arithmetic operator puzzle game. |
| **[ArithmaticOp.java](ArithmaticOp.java)** | AWT | `Frame` | Arithmetic operations (Add, Sub, Mul, Div) selector. |
| **[Check.java](Check.java)** | AWT | `Frame` | Illustrates checkboxes (`Checkbox`) and radio button groups. |
| **[ChoiceDemo.java](ChoiceDemo.java)** | Applet | `Applet` | Standard select drop-down layout selection demo. |
| **[Copy.java](Copy.java)** | AWT | `Frame` | Transports text values between text inputs dynamically. |
| **[CursorClick.java](CursorClick.java)** | AWT | `Frame` | Mouse click coordinate listener program. |
| **[CursorMove.java](CursorMove.java)** | AWT | `Frame` | Mouse path coordinate motion visualizer. |
| **[FontStyle.java](FontStyle.java)** | Applet | `Applet` | Rich label font face, weight, and color customiser. |
| **[Food.java](Food.java)** | AWT | `Frame` | Simple checklist menu selections counter form. |
| **[FrameSwitch.java](FrameSwitch.java)** | AWT | `Frame` | Demonstrates spawning and closing secondary windows. |
| **[Game1.java](Game1.java)** | Swing | `JFrame` | Math game matching values with grid keypads. |
| **[JTabelDemo.java](JTabelDemo.java)** | Swing | `JFrame` | Displays raw data items inside a structured `JTable`. |
| **[LineClick.java](LineClick.java)** | AWT | `Frame` | Real-time click-to-draw dynamic canvas painter. |
| **[ListSelection.java](ListSelection.java)** | Applet | `Applet` | Item scroll collection click list listener demonstration. |
| **[Login.java](Login.java)** | AWT | `Frame` | Classical Username / Password entry dialog GUI. |
| **[MenuBarDemo.java](MenuBarDemo.java)** | AWT | `Frame` | Calculator frame actions activated by a drop-down Menu Bar. |
| **[MyStack.java](MyStack.java)** | AWT | `Frame` | Visual Push/Pop Stack data structure simulator. |
| **[Number.java](Number.java)** | AWT | `Frame` | Numerical field counter with customizable step values. |
| **[Queue.java](Queue.java)** | AWT | `Frame` | Front/Rear enqueue/dequeue layout panel. |
| **[RGB.java](RGB.java)** | Applet | `Applet` | Canvas background mixer dynamically controlled by scrollbars. |
| **[RGB2.java](RGB2.java)** | Applet | `Applet` | RGB mixer with step adjustment buttons. |
| **[RGBText.java](RGBText.java)** | Applet | `Applet` | Controls text element font colors using color values. |
| **[RegisterDetail.java](RegisterDetail.java)** | AWT | `Frame` | Student Registration form with text, radio, choice fields. |
| **[Scroll.java](Scroll.java)** | Applet | `Applet` | Focus scroll bar adjustments event updates visualizer. |
| **[SquCube.java](SquCube.java)** | AWT | `Frame` | Calculates and displays square and cube of input numbers. |
| **[Validate1.java](Validate1.java)** | AWT | `Frame` | Real-time alphanumeric character validation filters. |

---

## 🚀 How to Run the Programs

To compile and run these programs, you must have the **Java SE Development Kit (JDK)** installed on your machine.

### 1. Compiling standard applications (AWT/Swing)
Open your terminal/command prompt, navigate to the directory where the source code is located, and compile the program:
```bash
javac ClassName.java
```
Run the compiled class file:
```bash
java ClassName
```
*Example (running `MyStack`):*
```bash
javac MyStack.java
java MyStack
```

### 2. Running Applets
Java Applets require a browser wrapper or the SDK's `appletviewer` tool. The source code files contain embedded applet code tags in comments to make launching easier.

Run the file using `appletviewer` directly:
```bash
appletviewer ClassName.java
```
*Example (running `RGB`):*
```bash
appletviewer RGB.java
```
*(Alternatively, you can write a simple `index.html` wrapper linking the compiled `.class` file and open it in a browser supporting Java plug-ins).*








