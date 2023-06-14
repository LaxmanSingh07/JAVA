# What is AWT

AWT stands for Abstract Window Toolkit. It is a platform dependent API for creating Graphical User Interface (GUI) for java programs. AWT is heavy weight component. AWT is the foundation upon which Swing is made.

### Frame:

Frame is a class of java.awt package. It is used to create `top level window`. It is the `container` that contains `all the objects such as buttons`, labels, textfields etc. It has no constructors.


`Types of Constructors` 

- Frame() : creates a frame with no title and specified layout.
- Frame(String title) : creates a frame with specified title and default layout.
- Frame(String title, LayoutManager layout) : creates a frame with specified title and layout.
- Frame(GraphicsConfiguration config) : creates a frame with the specified graphics configuration.

## Label

Label is a class of java.awt package. It is used to create a `label` that is a `non-editable text field`. It is used to display a `single line of read only text`. It has two constructors.

![AWT](https://www.oreilly.com/api/v2/epubs/9781565922402/files/images/ch015-f001.jpg)

## Event Delegation Model

Component generates the event. The event is passed to the object that implements the listener interface. The listener object invokes the appropriate method.

#### listener interface

`listener interface` is an interface that contains the methods that are invoked by the object that generates the event. It is implemented by the class that is interested in processing the event. It has no constructors.

`callback ` methods: The methods of listener interface are called callback methods because they are called back by the object that generates the event.

## When, Which Event is generated?



|Event |         Description |                          Listner Interface|
|:--:|:-:|:-:|

|ActionEvent|Generatedwhen a button is clicked,
a menu item is clicked,a text fieldS is a list item is double clicked,pressed enter key.| ActionListener|

MouseEvent     Generated when mouse                    MouseListener,
               is moved, dragged,
               clicked, pressed,
               released. MouseListener,
               MouseMotionListener

KeyEvent       Generated when a key                    KeyListener

ItemEvent      Generated when an item                  ItemListener
              is selected or deselected.

TextEvent      Generated when a text                   TextListener
              is entered in a text field.

MouseWheelEvent Generated when the mouse wheel          MouseWheelListener
               is rotated.

WindowEvent     Generated when a window is              WindowListener
               opened, closed, activated,
               deactivated, iconified,
               deiconified, moved,
               resized.

ComponentEvent  Generated when a component              ComponentListener
               is shown, hidden, moved,
               resized.

ContainerEvent  Generated when a component              ContainerListener
               is added to or removed
               from a container.



## Event Delegation Model

##### Component 

    Button (all the components)
    (i) Properties
    (ii) Methods
    (iii) Events

        |
        |
        |

    Listener (Receiver) 


In `the` `Delegation model`, a `source generates` an `event` and `forwards it` to `one or more listeners`, where the listener waits until `they receive an event`. `Once the listener gets the event`, `it is processed by the listener`, and then they return it. The UI elements can `delegate` an `event's processing` to a `separate function`.

This approach is more `convenient than the event model` (Java 1.0) because the events will only be received by the listeners who want to receive them in the `delegation event model`.

`The essential advantage of the Delegation Event Model is that the application logic is completely separated from the interface logic.`

`Registering` the `Source` With `Listener` in `Delegation` `Event Model`

The different Classes provide different registration methods.


## Checkbox and CheckboxGroup

`Checkbox` is a class of java.awt package. It is used to create a checkbox. It is used to turn an option on (true) or off (false). It has two constructors.

- Checkbox() : creates a checkbox with no label.
- Checkbox(String label) : creates a checkbox with the specified label.

`checkboxgroup` is a class of java.awt package. It is used to create a group of checkboxes. It is used to turn on one option out of many options. It has no constructors.

## TextField

`TextField` is a class of java.awt package. It is used to create a textfield that allows the user to enter a single line of text. It is a lightweight component that allows the editing of a single line text. It has two constructors.

- TextField() : creates a textfield with 0 columns.
- TextField(int columns) : creates a textfield with the specified number of columns.

## Layout Managers

- flowLayout
- borderLayout
- gridLayout
- gridBag
- cardLayout



- flowLayout : The FlowLayout is used to arrange the components in a line, one after another (in a flow). It is the default layout of applet or panel. It simply lays out components in a single row that wraps at the end.

ye can align the components in the center, left or right of the container. The default alignment is center.

Once it touch the right border of the container, it will wrap to the next line. It will not expand to fill the space.

- borderLayout : The BorderLayout is used to arrange the components in five regions: north, south, east, west and center. Each region (area) may contain one component only. `It is the default layout of frame or window`. The BorderLayout provides five constants for each region:

- GridLayout : The GridLayout is used to arrange the components in rectangular grid. One component is displayed in each rectangle.

- gridBag : The GridBagLayout is used to arrange the components in rectangular grid. But it is flexible than GridLayout. It is the most complex layout manager.

- CardLayout : The CardLayout is used to switch between the components. It treats each component as a card that is why it is known as CardLayout. The CardLayout provides three methods to switch between the components:

