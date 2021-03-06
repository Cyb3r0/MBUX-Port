
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for ARCADE_A2 (ID 0x0035)
**/

object ARCADE_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of ARCADE_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.ARCADE_A2)

	/** Gets frontal event 5 **/
	fun get_crash_c() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ARCADE_A2, 5, 1) != 0
	
	/** Sets frontal event 5 **/
	fun set_crash_c(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets frontal event 2 **/
	fun get_crash_f() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ARCADE_A2, 2, 1) != 0
	
	/** Sets frontal event 2 **/
	fun set_crash_f(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Confirm bit for all crash events, toggling **/
	fun get_conf_crash() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ARCADE_A2, 0, 1) != 0
	
	/** Sets Confirm bit for all crash events, toggling **/
	fun set_conf_crash(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.ARCADE_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame ARCADE_A2 (0x0035):
		|	frontal event 5: ${get_crash_c()}
		|	frontal event 2: ${get_crash_f()}
		|	Confirm bit for all crash events, toggling: ${get_conf_crash()}
	""".trimMargin("|")
}
