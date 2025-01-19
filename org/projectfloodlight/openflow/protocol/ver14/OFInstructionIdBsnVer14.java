// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import io.netty.buffer.ByteBuf;

abstract class OFInstructionIdBsnVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 12;


    public final static OFInstructionIdBsnVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFInstructionIdBsn> {
        @Override
        public OFInstructionIdBsn readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFInstructionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            int subtype = bb.readInt();
            bb.readerIndex(start);
            switch(subtype) {
               case 0x1:
                   // discriminator value 0x1L=0x1L for class OFInstructionIdBsnArpOffloadVer14
                   return OFInstructionIdBsnArpOffloadVer14.READER.readFrom(bb);
               case 0xb:
                   // discriminator value 0xbL=0xbL for class OFInstructionIdBsnAutoNegotiationVer14
                   return OFInstructionIdBsnAutoNegotiationVer14.READER.readFrom(bb);
               case 0x5:
                   // discriminator value 0x5L=0x5L for class OFInstructionIdBsnDenyVer14
                   return OFInstructionIdBsnDenyVer14.READER.readFrom(bb);
               case 0x2:
                   // discriminator value 0x2L=0x2L for class OFInstructionIdBsnDhcpOffloadVer14
                   return OFInstructionIdBsnDhcpOffloadVer14.READER.readFrom(bb);
               case 0x10:
                   // discriminator value 0x10L=0x10L for class OFInstructionIdBsnDirectedBroadcastVer14
                   return OFInstructionIdBsnDirectedBroadcastVer14.READER.readFrom(bb);
               case 0xd:
                   // discriminator value 0xdL=0xdL for class OFInstructionIdBsnDisableL3Ver14
                   return OFInstructionIdBsnDisableL3Ver14.READER.readFrom(bb);
               case 0x0:
                   // discriminator value 0x0L=0x0L for class OFInstructionIdBsnDisableSrcMacCheckVer14
                   return OFInstructionIdBsnDisableSrcMacCheckVer14.READER.readFrom(bb);
               case 0x9:
                   // discriminator value 0x9L=0x9L for class OFInstructionIdBsnDisableVlanCountersVer14
                   return OFInstructionIdBsnDisableVlanCountersVer14.READER.readFrom(bb);
               case 0xf:
                   // discriminator value 0xfL=0xfL for class OFInstructionIdBsnHashSelectVer14
                   return OFInstructionIdBsnHashSelectVer14.READER.readFrom(bb);
               case 0xc:
                   // discriminator value 0xcL=0xcL for class OFInstructionIdBsnInternalPriorityVer14
                   return OFInstructionIdBsnInternalPriorityVer14.READER.readFrom(bb);
               case 0xe:
                   // discriminator value 0xeL=0xeL for class OFInstructionIdBsnNdpOffloadVer14
                   return OFInstructionIdBsnNdpOffloadVer14.READER.readFrom(bb);
               case 0x6:
                   // discriminator value 0x6L=0x6L for class OFInstructionIdBsnPacketOfDeathVer14
                   return OFInstructionIdBsnPacketOfDeathVer14.READER.readFrom(bb);
               case 0x4:
                   // discriminator value 0x4L=0x4L for class OFInstructionIdBsnPermitVer14
                   return OFInstructionIdBsnPermitVer14.READER.readFrom(bb);
               case 0x7:
                   // discriminator value 0x7L=0x7L for class OFInstructionIdBsnPrioritizePdusVer14
                   return OFInstructionIdBsnPrioritizePdusVer14.READER.readFrom(bb);
               case 0x8:
                   // discriminator value 0x8L=0x8L for class OFInstructionIdBsnRequireVlanXlateVer14
                   return OFInstructionIdBsnRequireVlanXlateVer14.READER.readFrom(bb);
               case 0xa:
                   // discriminator value 0xaL=0xaL for class OFInstructionIdBsnSpanDestinationVer14
                   return OFInstructionIdBsnSpanDestinationVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator subtype of class OFInstructionIdBsnVer14: " + subtype);
            }
        }
    }
}
