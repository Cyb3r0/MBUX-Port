
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for AGW_A3 (ID 0x0138)
**/

object AGW_A3 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of AGW_A3
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.AGW_A3)

	/** Gets Numeric keypad head unit **/
	fun get_ziffer_hu() : ZIFFER_HU = when(CanBusNative.getECUParameterB(CanBAddrs.AGW_A3, 4, 4)) {
		 0 -> ZIFFER_HU.N_BET
		 1 -> ZIFFER_HU.T1_KEY
		 2 -> ZIFFER_HU.T2
		 3 -> ZIFFER_HU.T3
		 4 -> ZIFFER_HU.T4
		 5 -> ZIFFER_HU.T5
		 6 -> ZIFFER_HU.T6
		 7 -> ZIFFER_HU.T7
		 8 -> ZIFFER_HU.T8
		 9 -> ZIFFER_HU.T9_KEY
		 10 -> ZIFFER_HU.T10_BUTTON
		 else -> throw Exception("Invalid raw value for ZIFFER_HU")
	}
	
	/** Sets Numeric keypad head unit **/
	fun set_ziffer_hu(f: CanFrame, p: ZIFFER_HU) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 4, p.raw)
	}
	
	/** Gets Diamond key pressed **/
	fun get_raute_hu() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AGW_A3, 3, 1) != 0
	
	/** Sets Diamond key pressed **/
	fun set_raute_hu(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets star key pressed **/
	fun get_stern_hu() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AGW_A3, 2, 1) != 0
	
	/** Sets star key pressed **/
	fun set_stern_hu(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Rejection of numeric entry HU **/
	fun get_cancel_hu() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.AGW_A3, 1, 1) != 0
	
	/** Sets Rejection of numeric entry HU **/
	fun set_cancel_hu(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Active application **/
	fun get_akt_sys() : AKT_SYS = when(CanBusNative.getECUParameterB(CanBAddrs.AGW_A3, 13, 3)) {
		 0 -> AKT_SYS.IDLE
		 1 -> AKT_SYS.RADIO_DATA_TRANSMISSION
		 else -> throw Exception("Invalid raw value for AKT_SYS")
	}
	
	/** Sets Active application **/
	fun set_akt_sys(f: CanFrame, p: AKT_SYS) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 3, p.raw)
	}
	
	/** Gets function keys **/
	fun get_function_keys() : FUNCTION_KEYS = when(CanBusNative.getECUParameterB(CanBAddrs.AGW_A3, 10, 3)) {
		 0 -> FUNCTION_KEYS.N_BET
		 1 -> FUNCTION_KEYS.F1
		 2 -> FUNCTION_KEYS.F2
		 3 -> FUNCTION_KEYS.F3
		 4 -> FUNCTION_KEYS.F4
		 5 -> FUNCTION_KEYS.F5
		 6 -> FUNCTION_KEYS.F6
		 7 -> FUNCTION_KEYS.F7
		 else -> throw Exception("Invalid raw value for FUNCTION_KEYS")
	}
	
	/** Sets function keys **/
	fun set_function_keys(f: CanFrame, p: FUNCTION_KEYS) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 3, p.raw)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.AGW_A3.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame AGW_A3 (0x0138):
		|	Numeric keypad head unit: ${get_ziffer_hu()}
		|	Diamond key pressed: ${get_raute_hu()}
		|	star key pressed: ${get_stern_hu()}
		|	Rejection of numeric entry HU: ${get_cancel_hu()}
		|	Active application: ${get_akt_sys()}
		|	function keys: ${get_function_keys()}
	""".trimMargin("|")
}
