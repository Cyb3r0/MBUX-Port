
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for UBF_A1 (ID 0x001A)
**/

object UBF_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of UBF_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.UBF_A1)

	/** Gets Radio activation button pressed **/
	fun get_fu_frsp_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 7, 1) != 0
	
	/** Sets Radio activation button pressed **/
	fun set_fu_frsp_bet(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets ASG sport mode on / off activated (ST2_LED_DL if ABC is available) **/
	fun get_asg_sport_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 4, 1) != 0
	
	/** Sets ASG sport mode on / off activated (ST2_LED_DL if ABC is available) **/
	fun set_asg_sport_bet(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets ART distance warning on / off activated **/
	fun get_art_abw_bet() : ART_ABW_BET = when(CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 2, 2)) {
		 0 -> ART_ABW_BET.NDEF_NBET
		 1 -> ART_ABW_BET.AUS_NDEF
		 2 -> ART_ABW_BET.ON_BET
		 3 -> ART_ABW_BET.SNV
		 else -> throw Exception("Invalid raw value for ART_ABW_BET")
	}
	
	/** Sets ART distance warning on / off activated **/
	fun set_art_abw_bet(f: CanFrame, p: ART_ABW_BET) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 2, p.raw)
	}
	
	/** Gets distance factor **/
	fun get_art_abstand() : Int = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 8, 8)
	
	/** Sets distance factor **/
	fun set_art_abstand(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets Authority radio button pressed **/
	fun get_bh_funk_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 18, 1) != 0
	
	/** Sets Authority radio button pressed **/
	fun set_bh_funk_bet(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets LEDs for auxiliary heater defective **/
	fun get_led_sth_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 26, 1) != 0
	
	/** Sets LEDs for auxiliary heater defective **/
	fun set_led_sth_def(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets Auxiliary heating switch actuated **/
	fun get_sthl_bet() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.UBF_A1, 24, 1) != 0
	
	/** Sets Auxiliary heating switch actuated **/
	fun set_sthl_bet(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.UBF_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame UBF_A1 (0x001A):
		|	Radio activation button pressed: ${get_fu_frsp_bet()}
		|	ASG sport mode on / off activated (ST2_LED_DL if ABC is available): ${get_asg_sport_bet()}
		|	ART distance warning on / off activated: ${get_art_abw_bet()}
		|	distance factor: ${get_art_abstand()}
		|	Authority radio button pressed: ${get_bh_funk_bet()}
		|	LEDs for auxiliary heater defective: ${get_led_sth_def()}
		|	Auxiliary heating switch actuated: ${get_sthl_bet()}
	""".trimMargin("|")
}
