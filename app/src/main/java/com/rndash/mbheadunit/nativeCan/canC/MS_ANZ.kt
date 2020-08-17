
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_ANZ (ID 0x033D)
**/

object MS_ANZ {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_ANZ
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_ANZ)

	/** Gets number of the ASS status message **/
	fun get_ass_dspl() : ASS_DSPL = when(CanBusNative.getECUParameterC(CanCAddrs.MS_ANZ, 20, 4)) {
		 0 -> ASS_DSPL.IDLE
		 1 -> ASS_DSPL.M1
		 2 -> ASS_DSPL.M2
		 3 -> ASS_DSPL.M3
		 4 -> ASS_DSPL.M4
		 5 -> ASS_DSPL.M5
		 6 -> ASS_DSPL.M6
		 7 -> ASS_DSPL.M7
		 8 -> ASS_DSPL.M8
		 9 -> ASS_DSPL.M9
		 10 -> ASS_DSPL.M10
		 11 -> ASS_DSPL.M11
		 12 -> ASS_DSPL.M12
		 13 -> ASS_DSPL.M13
		 14 -> ASS_DSPL.M14
		 15 -> ASS_DSPL.M15
		 else -> throw Exception("Invalid raw value for ASS_DSPL")
	}
	
	/** Sets number of the ASS status message **/
	fun set_ass_dspl(f: CanFrame, p: ASS_DSPL) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 20, 4, p.raw)
	}
	
	/** Gets number of the ASS warning message **/
	fun get_ass_warn() : ASS_WARN = when(CanBusNative.getECUParameterC(CanCAddrs.MS_ANZ, 16, 4)) {
		 0 -> ASS_WARN.IDLE
		 1 -> ASS_WARN.M1
		 2 -> ASS_WARN.M2
		 3 -> ASS_WARN.M3
		 4 -> ASS_WARN.M4
		 5 -> ASS_WARN.M5
		 6 -> ASS_WARN.M6
		 7 -> ASS_WARN.M7
		 8 -> ASS_WARN.M8
		 9 -> ASS_WARN.M9
		 10 -> ASS_WARN.M10
		 11 -> ASS_WARN.M11
		 12 -> ASS_WARN.M12
		 13 -> ASS_WARN.M13
		 14 -> ASS_WARN.M14
		 15 -> ASS_WARN.M15
		 else -> throw Exception("Invalid raw value for ASS_WARN")
	}
	
	/** Sets number of the ASS warning message **/
	fun set_ass_warn(f: CanFrame, p: ASS_WARN) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 4, p.raw)
	}
	
	/** Gets Suppression of lamp test during the stop phase **/
	fun get_ass_ltest_aus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_ANZ, 24, 1) != 0
	
	/** Sets Suppression of lamp test during the stop phase **/
	fun set_ass_ltest_aus(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_ANZ.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MS_ANZ (0x033D):
		|	number of the ASS status message: ${get_ass_dspl()}
		|	number of the ASS warning message: ${get_ass_warn()}
		|	Suppression of lamp test during the stop phase: ${get_ass_ltest_aus()}
	""".trimMargin("|")
}