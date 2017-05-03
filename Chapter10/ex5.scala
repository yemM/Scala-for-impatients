trait PropertyChangeSupport
{
	import java.beans.{ PropertyChangeSupport => JavaBeansPropertyChangeSupport, _ }
	
	val support = new JavaBeansPropertyChangeSupport(this)
  
	def addPropertyChangeListener(listener: PropertyChangeListener) {
		support.addPropertyChangeListener(listener)
	}

	def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener) {
		support.addPropertyChangeListener(propertyName, listener)
	}

	def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean) {
		support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
	}

	def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int) {
		support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
	}

	def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: AnyRef, newValue: AnyRef) {
		support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
	}

	def firePropertyChange(event: PropertyChangeEvent) {
		support.firePropertyChange(event)
	}

	def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean) {
		support.firePropertyChange(propertyName, oldValue, newValue)
	}

	def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int) {
		support.firePropertyChange(propertyName, oldValue, newValue)
	}

	def firePropertyChange(propertyName: String, oldValue: AnyRef, newValue: AnyRef) {
		support.firePropertyChange(propertyName, oldValue, newValue)
	}

	def getPropertyChangeListeners(): Array[PropertyChangeListener] = {
		support.getPropertyChangeListeners()
	}

	def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = {
		support.getPropertyChangeListeners(propertyName)
	}

	def hasListeners(propertyName: String): Boolean = {
		support.hasListeners(propertyName)
	}

	def removePropertyChangeListener(listener: PropertyChangeListener) {
		support.removePropertyChangeListener(listener)
	}

	def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener) {
		support.removePropertyChangeListener(propertyName, listener)
	}
}

import java.awt.Point
import java.beans.PropertyChangeListener

class ListenedPoint(x: Int, y: Int, private val listener: PropertyChangeListener = null) extends Point(x, y) with PropertyChangeSupport
{
  if(null != listener) this.addPropertyChangeListener(listener)

  override def setLocation(location: Point) {

    if(null != listener) {
      this.firePropertyChange("location", this, location)
    }

    super.setLocation(location)
  }

  override def setLocation(x: Int, y: Int) {
    val oldX = this.getX.toInt
    val oldY = this.getY.toInt

    super.setLocation(x, y)

    if(null != listener) {
      this.firePropertyChange("x", oldX, x)
      this.firePropertyChange("y", oldY, y)
    }
  }
}

val myPoint = new ListenedPoint(10,24)