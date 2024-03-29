# Repository of various different patterns
The aim of this repository is to write a viariety of different patterns in order to find out how they work.
This makes it simpler for everyone to understand and use these patterns during work

# Chain-of-responsibility
In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects.
[1] Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. 

A mechanism also exists for adding new processing objects to the end of this chain. 
Thus, the chain of responsibility is an object oriented version of the if ... else if ... else if ....... else ... endif idiom, 
with the benefit that the condition–action blocks can be dynamically rearranged and reconfigured at runtime. 

# Decorator
Decorator attaches new responsibility to a class dynamically. It is alternative way to extend functionality instead of subclassing.
Decorator adds functionality to object without affects on other objects. Functionality can be taken off afterwards by use of decorator.
You can add additional state with decorator.

# Proxy
Proxy provides an interface for accessing some resource. It can also add some additional functionality. 
Basically it wraps some resource and delegates calls to wrapped resource. 
Proxy is used for example logging, access controlling and remote proxying.

# Strategy
In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.
