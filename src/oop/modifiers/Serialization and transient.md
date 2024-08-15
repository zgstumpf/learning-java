Serialization: Converting an object into a byte stream. This byte stream enables an object to be 
persisted in a file or transmitted over a network. The object's entire tree is serialized.
Deserialization: Converting a byte stream into an object.

If an attribute or method has the < transient > modifier, it will not be included in the byte stream.

An attribute or method should be < transient > if 1 or more is true:
1. it contains sensitive info
2. serialization will error
3. its data can be derived


What does a method look like if it serialized???


(https://docs.oracle.com/javase/8/docs/technotes/guides/serialization/index.html)