JFLAGS = -g
BIN = bin
SRC = src
JC = javac
JVM = java
JFX = --module-path lib --add-modules javafx.controls,javafx.media
FILE = config.txt

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JFX) -d $(BIN) -cp $(SRC) $*.java

CLASSES = \
    /Stage1.java \
    /Sensor.java \
    /MagneticSensor.java \
    /MagneticSensorView.java \
    /SwitchState.java \
    /State.java \
    /House.java \
    /WindowView.java \
    /Window.java

MAIN = Stage1

default: classes

classes: $(addprefix $(SRC)/, $(CLASSES:.java=.class))

run:
	$(JVM) $(JFX) -cp $(BIN) $(MAIN) $(FILE)

clean:
	$(RM) $(BIN)/*.class