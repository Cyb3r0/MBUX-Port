package com.rndash.mbheadunit.nativeCan.canC


import com.rndash.mbheadunit.nativeCan.CanCAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame GS_102h (ID: 0x0102)
**/
object GS_102h {

	/** FBS-Botschaft an EZS (8 Byte) **/
	fun get_gs_fbs() : Int = getParam(0, 64)

	override fun toString(): String {
		return """
			GS_FBS: ${get_gs_fbs()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_102h, o, l)
}
