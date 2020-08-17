
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HSB (ID 0x050B)
**/

object GS_HSB {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of GS_HSB
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.GS_HSB)

	/** Gets manual control on the test bench **/
	fun get_hsb() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSB, 0, 64)
	
	/** Sets manual control on the test bench **/
	fun set_hsb(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.GS_HSB.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame GS_HSB (0x050B):
		|	manual control on the test bench: ${get_hsb()}
	""".trimMargin("|")
}