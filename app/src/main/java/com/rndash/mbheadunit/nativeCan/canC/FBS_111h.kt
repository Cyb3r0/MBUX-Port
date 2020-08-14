package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame FBS_111h (ID: 0x0111)
**/
object FBS_111h {

	/** FBS-Botschaft an MS (8 Byte) **/
	fun get_fbs_ms() : Int = getParam(0, 64)

	override fun toString(): String {
		return """
			FBS_MS: ${get_fbs_ms()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.FBS_111h, o, l)
}
