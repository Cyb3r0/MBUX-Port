package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame ARCADE_A2 (ID: 0x0035)
**/
object ARCADE_A2 {

	/** Confirm bit for all crash events, toggling **/
	fun get_conf_crash() : Boolean = getParam(0, 1) != 0

	/** Frontal Event 2 **/
	fun get_crash_f() : Boolean = getParam(2, 1) != 0

	/** Frontal Event 5 **/
	fun get_crash_c() : Boolean = getParam(5, 1) != 0

	override fun toString(): String {
		return """
			CONF_CRASH: ${get_conf_crash()}
			CRASH_F: ${get_crash_f()}
			CRASH_C: ${get_crash_c()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.ARCADE_A2, o, l)
}
