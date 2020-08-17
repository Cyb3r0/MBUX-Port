
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for FBS_114h (ID 0x0114)
**/

object FBS_114h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of FBS_114h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.FBS_114h)

	/** Gets FBS message to EWM (8 bytes) **/
	fun get_fbs_ewm() : Int = CanBusNative.getECUParameterC(CanCAddrs.FBS_114h, 0, 64)
	
	/** Sets FBS message to EWM (8 bytes) **/
	fun set_fbs_ewm(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.FBS_114h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame FBS_114h (0x0114):
		|	FBS message to EWM (8 bytes): ${get_fbs_ewm()}
	""".trimMargin("|")
}