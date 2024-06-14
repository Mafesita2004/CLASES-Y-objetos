//open class SmartDevice(val name: String, val category: String) {
//    var deviceStatus = "offline"
//    var deviceType = "Unknown"
//
//    open fun turnOn() {
//        deviceStatus = "on"
//    }
//
//    open fun turnOff() {
//        deviceStatus = "off"
//    }
//
//    fun printDeviceInfo() {
//        println("Device name: $name, category: $category, type: $deviceType")
//    }
//}
//
//class RangeRegulator(
//    initialValue: Int,
//    private val minValue: Int,
//    private val maxValue: Int
//) : ReadWriteProperty<Any?, Int> {
//
//    var fieldData = initialValue
//
//    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
//        return fieldData
//    }
//
//    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
//        if (value in minValue..maxValue) {
//            fieldData = value
//        }
//    }
//}
//
//class SmartTvDevice(deviceName: String, deviceCategory: String) :
//    SmartDevice(name = deviceName, category = deviceCategory) {
//
//    override var deviceType = "Smart TV"
//
//    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
//    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
//
//    fun increaseSpeakerVolume() {
//        speakerVolume++
//        println("Speaker volume increased to $speakerVolume.")
//    }
//
//    fun decreaseVolume() {
//        speakerVolume--
//        println("Speaker volume decreased to $speakerVolume.")
//    }
//
//    fun nextChannel() {
//        channelNumber++
//        println("Channel number increased to $channelNumber.")
//    }
//
//    fun previousChannel() {
//        channelNumber--
//        println("Channel number decreased to $channelNumber.")
//    }
//
//    override fun turnOn() {
//        super.turnOn()
//        println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is set to $channelNumber.")
//    }
//
//    override fun turnOff() {
//        super.turnOff()
//        println("$name turned off")
//    }
//}
//
//class SmartLightDevice(deviceName: String, deviceCategory: String) :
//    SmartDevice(name = deviceName, category = deviceCategory) {
//
//    override var deviceType = "Smart Light"
//
//    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
//
//    fun increaseBrightness() {
//        brightnessLevel++
//        println("Brightness increased to $brightnessLevel.")
//    }
//
//    fun decreaseBrightness() {
//        brightnessLevel--
//        println("Brightness decreased to $brightnessLevel.")
//    }
//
//    override fun turnOn() {
//        super.turnOn()
//        println("$name turned on. The brightness level is $brightnessLevel.")
//    }
//
//    override fun turnOff() {
//        super.turnOff()
//        println("Smart Light turned off")
//    }
//}
//
//class SmartHome(
//    private val smartTvDevice: SmartTvDevice,
//    private val smartLightDevice: SmartLightDevice
//) {
//    var deviceTurnOnCount = 0
//
//    private fun isAllDevicesOn(): Boolean {
//        return smartTvDevice.deviceStatus == "on" && smartLightDevice.deviceStatus == "on"
//    }
//
//    private fun updateTurnOnCount() {
//        if (isAllDevicesOn()) {
//            deviceTurnOnCount++
//        }
//    }
//
//    fun turnOnAllDevices() {
//        smartTvDevice.turnOn()
//        smartLightDevice.turnOn()
//        updateTurnOnCount()
//    }
//
//    fun turnOffAllDevices() {
//        smartTvDevice.turnOff()
//        smartLightDevice.turnOff()
//    }
//
//    fun decreaseTvVolume() {
//        if (isAllDevicesOn()) {
//            smartTvDevice.decreaseVolume()
//        }
//    }
//
//    fun changeTvChannelToPrevious() {
//        if (isAllDevicesOn()) {
//            smartTvDevice.previousChannel()
//        }
//    }
//
//    fun printSmartTvInfo() {
//        if (isAllDevicesOn()) {
//            smartTvDevice.printDeviceInfo()
//        }
//    }
//
//    fun printSmartLightInfo() {
//        if (isAllDevicesOn()) {
//            smartLightDevice.printDeviceInfo()
//        }
//    }
//
//    fun decreaseLightBrightness() {
//        if (isAllDevicesOn()) {
//            smartLightDevice.decreaseBrightness()
//        }
//    }
//}
//
//fun main() {
//    val smartTv = SmartTvDevice("Living Room TV", "Entertainment")
//    val smartLight = SmartLightDevice("Living Room Light", "Home Automation")
//
//    val smartHome = SmartHome(smartTv, smartLight)
//
//    smartHome.turnOnAllDevices()
//    smartHome.decreaseTvVolume()
//    smartHome.changeTvChannelToPrevious()
//    smartHome.printSmartTvInfo()
//    smartHome.printSmartLightInfo()
//    smartHome.decreaseLightBrightness()
//    smartHome.turnOffAllDevices()
//}



