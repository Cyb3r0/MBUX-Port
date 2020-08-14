package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame MS_2F3h (ID: 0x02F3)
**/
object MS_2F3h {

	/** Gear shift recommendation "Is" **/
	fun get_fsc_ist() : Int = getParam(0, 8)

	/** Gear shift recommendation "shall" **/
	fun get_fsc_soll() : Int = getParam(40, 8)

	override fun toString(): String {
		return """
			FSC_IST: ${get_fsc_ist()}
			FSC_SOLL: ${get_fsc_soll()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_2F3h, o, l)
}
