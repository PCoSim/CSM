# CSM
Co-Simulation Master that dynamically loads a plugin.

Main takes an path argument to a service provider jar providing the
implementation of the IDoStepPlugin service from PluginInterfaces.

The service provider is loaded and executed.

Requires the PluginInterfaces in class path

## SPI
spi is Service Provider Interface. 
Lets you drop a small text file into a jar saying "I have a class that implements this interface", 
then use java.util.ServiceLoader at runtime to find all implementations of that interface.  
See http://bit.ly/UsqMuz for an intro and https://github.com/aalmiray/jipsy to make creating the service files much simpler.
