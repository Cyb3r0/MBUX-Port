package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame VIN (ID: 0x06FA)
**/
object VIN {

	/** VIN Control unit **/
	fun get_vin_msg() : Int = getParam(6, 2)

	/** VIN data **/
	fun get_vin_data() : Int = getParam(8, 56)

	override fun toString(): String {
		return """
			VIN_MSG: ${get_vin_msg()}
			VIN_DATA: ${get_vin_data()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.VIN, o, l)
}
