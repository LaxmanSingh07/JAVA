# What is AWT

AWT stands for Abstract Window Toolkit. It is a platform dependent API for creating Graphical User Interface (GUI) for java programs. AWT is heavy weight component. AWT is the foundation upon which Swing is made.

### Frame:

Frame is a class of java.awt package. It is used to create `top level window`. It is the `container` that contains `all the objects such as buttons`, labels, textfields etc. It has no constructors.

## Label

Label is a class of java.awt package. It is used to create a `label` that is a `non-editable text field`. It is used to display a `single line of read only text`. It has two constructors.

![AWT](https://www.oreilly.com/api/v2/epubs/9781565922402/files/images/ch015-f001.jpg)

## Event Delegation Model

Component generates the event. The event is passed to the object that implements the listener interface. The listener object invokes the appropriate method.

#### listener interface

`listener interface` is an interface that contains the methods that are invoked by the object that generates the event. It is implemented by the class that is interested in processing the event. It has no constructors.

`callback ` methods: The methods of listener interface are called callback methods because they are called back by the object that generates the event.

## When, Which Event is generated?

```

Event          Description                           Listner Interface

ActionEvent    Generated when                          ActionListener
               a button is clicked,
               a menu item is clicked,
               a text fieldS is a list
               item is double clicked,
               pressed enter key.

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


```

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