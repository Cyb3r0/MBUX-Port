package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame GS_HSC (ID: 0x050C)
**/
object GS_HSC {

	/** Handsteuerung am Prüfstand **/
	fun get_hsc() : Int = getParam(0, 64)

	override fun toString(): String {
		return """
			HSC: ${get_hsc()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSC, o, l)
}
