
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EWM_MESS1 (ID 0x06F0)
**/

object EWM_MESS1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EWM_MESS1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.EWM_MESS1)

	/** Gets measured values **/
	fun get_mess1() : Int = CanBusNative.getECUParameterC(CanCAddrs.EWM_MESS1, 0, 64)
	
	/** Sets measured values **/
	fun set_mess1(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.EWM_MESS1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame EWM_MESS1 (0x06F0):
		|	measured values: ${get_mess1()}
	""".trimMargin("|")
}
