
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TPM_A1 (ID 0x02FF)
**/

object TPM_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TPM_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TPM_A1)

	/** Gets TPM state **/
	fun get_tpm_stat() : TPM_STAT = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 4, 4)) {
		 0 -> TPM_STAT.DISP_VAL
		 1 -> TPM_STAT.MEASURE
		 2 -> TPM_STAT.WAIT
		 3 -> TPM_STAT.OFF
		 4 -> TPM_STAT.DIAG
		 5 -> TPM_STAT.ERROR
		 6 -> TPM_STAT.ACTIVE
		 7 -> TPM_STAT.NO_WE
		 15 -> TPM_STAT.SNA
		 else -> throw Exception("Invalid raw value for TPM_STAT")
	}
	
	/** Sets TPM state **/
	fun set_tpm_stat(f: CanFrame, p: TPM_STAT) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 4, p.raw)
	}
	
	/** Gets TPM message display request **/
	fun get_tpm_msgdisp_rq() : TPM_MSGDISP_RQ = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 0, 4)) {
		 0 -> TPM_MSGDISP_RQ.NO_MESS
		 1 -> TPM_MSGDISP_RQ.NEW_VAL
		 2 -> TPM_MSGDISP_RQ.UNPLAUSIBLE
		 3 -> TPM_MSGDISP_RQ.NO_WE
		 4 -> TPM_MSGDISP_RQ.OFF
		 5 -> TPM_MSGDISP_RQ.ERROR
		 6 -> TPM_MSGDISP_RQ.TNA
		 7 -> TPM_MSGDISP_RQ.WLI
		 8 -> TPM_MSGDISP_RQ.WE_MISS
		 9 -> TPM_MSGDISP_RQ.NEW_ACT
		 10 -> TPM_MSGDISP_RQ.NEW_VAL_L
		 11 -> TPM_MSGDISP_RQ.UNPLAUSI_L
		 15 -> TPM_MSGDISP_RQ.SNA
		 else -> throw Exception("Invalid raw value for TPM_MSGDISP_RQ")
	}
	
	/** Sets TPM message display request **/
	fun set_tpm_msgdisp_rq(f: CanFrame, p: TPM_MSGDISP_RQ) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 4, p.raw)
	}
	
	/** Gets TPM warning display request **/
	fun get_tpm_warndisp_rq() : TPM_WARNDISP_RQ = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 13, 3)) {
		 0 -> TPM_WARNDISP_RQ.NO_WARN
		 1 -> TPM_WARNDISP_RQ.SOFT
		 2 -> TPM_WARNDISP_RQ.LOW_P
		 3 -> TPM_WARNDISP_RQ.FAST
		 7 -> TPM_WARNDISP_RQ.SNA
		 else -> throw Exception("Invalid raw value for TPM_WARNDISP_RQ")
	}
	
	/** Sets TPM warning display request **/
	fun set_tpm_warndisp_rq(f: CanFrame, p: TPM_WARNDISP_RQ) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 3, p.raw)
	}
	
	/** Gets Tire pressure module indication lamp on request **/
	fun get_tpm_indlmp_on_rq() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 12, 1) != 0
	
	/** Sets Tire pressure module indication lamp on request **/
	fun set_tpm_indlmp_on_rq(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire in limp-home operation mode **/
	fun get_tire_lhom() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 11, 1) != 0
	
	/** Sets Tire in limp-home operation mode **/
	fun set_tire_lhom(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire pressure module malfunction lamp on request **/
	fun get_tpm_malflmp_on_rq() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 10, 1) != 0
	
	/** Sets Tire pressure module malfunction lamp on request **/
	fun set_tpm_malflmp_on_rq(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire pressure module display on request **/
	fun get_tpm_disp_on_rq() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 9, 1) != 0
	
	/** Sets Tire pressure module display on request **/
	fun set_tpm_disp_on_rq(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire front left **/
	fun get_tire_fl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 20, 1) != 0
	
	/** Sets Tire front left **/
	fun set_tire_fl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire front right **/
	fun get_tire_fr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 19, 1) != 0
	
	/** Sets Tire front right **/
	fun set_tire_fr(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire rear left **/
	fun get_tire_rl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 18, 1) != 0
	
	/** Sets Tire rear left **/
	fun set_tire_rl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire rear right **/
	fun get_tire_rr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 17, 1) != 0
	
	/** Sets Tire rear right **/
	fun set_tire_rr(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets Spare tire **/
	fun get_tire_spr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 16, 1) != 0
	
	/** Sets Spare tire **/
	fun set_tire_spr(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets Tire pressure front left  **/
	fun get_tirepress_fl() : TIREPRESS_FL = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 24, 8)) {
		 254 -> TIREPRESS_FL.NO_IND
		 255 -> TIREPRESS_FL.SNA
		 else -> throw Exception("Invalid raw value for TIREPRESS_FL")
	}
	
	/** Sets Tire pressure front left  **/
	fun set_tirepress_fl(f: CanFrame, p: TIREPRESS_FL) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 8, p.raw)
	}
	
	/** Gets Tire pressure front right  **/
	fun get_tirepress_fr() : TIREPRESS_FR = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 32, 8)) {
		 254 -> TIREPRESS_FR.NO_IND
		 255 -> TIREPRESS_FR.SNA
		 else -> throw Exception("Invalid raw value for TIREPRESS_FR")
	}
	
	/** Sets Tire pressure front right  **/
	fun set_tirepress_fr(f: CanFrame, p: TIREPRESS_FR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 8, p.raw)
	}
	
	/** Gets Tire pressure rear left  **/
	fun get_tirepress_rl() : TIREPRESS_RL = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 40, 8)) {
		 254 -> TIREPRESS_RL.NO_IND
		 255 -> TIREPRESS_RL.SNA
		 else -> throw Exception("Invalid raw value for TIREPRESS_RL")
	}
	
	/** Sets Tire pressure rear left  **/
	fun set_tirepress_rl(f: CanFrame, p: TIREPRESS_RL) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 40, 8, p.raw)
	}
	
	/** Gets Tire pressure rear right  **/
	fun get_tirepress_rr() : TIREPRESS_RR = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 48, 8)) {
		 254 -> TIREPRESS_RR.NO_IND
		 255 -> TIREPRESS_RR.SNA
		 else -> throw Exception("Invalid raw value for TIREPRESS_RR")
	}
	
	/** Sets Tire pressure rear right  **/
	fun set_tirepress_rr(f: CanFrame, p: TIREPRESS_RR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 48, 8, p.raw)
	}
	
	/** Gets Tire pressure spare tire  **/
	fun get_tirepress_spr() : TIREPRESS_SPR = when(CanBusNative.getECUParameterB(CanBAddrs.TPM_A1, 56, 8)) {
		 254 -> TIREPRESS_SPR.NO_IND
		 255 -> TIREPRESS_SPR.SNA
		 else -> throw Exception("Invalid raw value for TIREPRESS_SPR")
	}
	
	/** Sets Tire pressure spare tire  **/
	fun set_tirepress_spr(f: CanFrame, p: TIREPRESS_SPR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 56, 8, p.raw)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TPM_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TPM_A1 (0x02FF):
		|	TPM state: ${get_tpm_stat()}
		|	TPM message display request: ${get_tpm_msgdisp_rq()}
		|	TPM warning display request: ${get_tpm_warndisp_rq()}
		|	Tire pressure module indication lamp on request: ${get_tpm_indlmp_on_rq()}
		|	Tire in limp-home operation mode: ${get_tire_lhom()}
		|	Tire pressure module malfunction lamp on request: ${get_tpm_malflmp_on_rq()}
		|	Tire pressure module display on request: ${get_tpm_disp_on_rq()}
		|	Tire front left: ${get_tire_fl()}
		|	Tire front right: ${get_tire_fr()}
		|	Tire rear left: ${get_tire_rl()}
		|	Tire rear right: ${get_tire_rr()}
		|	Spare tire: ${get_tire_spr()}
		|	Tire pressure front left : ${get_tirepress_fl()} bar
		|	Tire pressure front right : ${get_tirepress_fr()} bar
		|	Tire pressure rear left : ${get_tirepress_rl()} bar
		|	Tire pressure rear right : ${get_tirepress_rr()} bar
		|	Tire pressure spare tire : ${get_tirepress_spr()} bar
	""".trimMargin("|")
}
