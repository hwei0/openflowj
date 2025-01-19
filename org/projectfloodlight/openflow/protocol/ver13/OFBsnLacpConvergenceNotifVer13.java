// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnLacpConvergenceNotifVer13 implements OFBsnLacpConvergenceNotif {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnLacpConvergenceNotifVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 52;

        private final static long DEFAULT_XID = 0x0L;
        private final static short DEFAULT_CONVERGENCE_STATUS = (short) 0x0;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static int DEFAULT_ACTOR_SYS_PRIORITY = 0x0;
        private final static MacAddress DEFAULT_ACTOR_SYS_MAC = MacAddress.NONE;
        private final static int DEFAULT_ACTOR_PORT_PRIORITY = 0x0;
        private final static int DEFAULT_ACTOR_PORT_NUM = 0x0;
        private final static int DEFAULT_ACTOR_KEY = 0x0;
        private final static int DEFAULT_PARTNER_SYS_PRIORITY = 0x0;
        private final static MacAddress DEFAULT_PARTNER_SYS_MAC = MacAddress.NONE;
        private final static int DEFAULT_PARTNER_PORT_PRIORITY = 0x0;
        private final static int DEFAULT_PARTNER_PORT_NUM = 0x0;
        private final static int DEFAULT_PARTNER_KEY = 0x0;

    // OF message fields
    private final long xid;
    private final short convergenceStatus;
    private final OFPort portNo;
    private final int actorSysPriority;
    private final MacAddress actorSysMac;
    private final int actorPortPriority;
    private final int actorPortNum;
    private final int actorKey;
    private final int partnerSysPriority;
    private final MacAddress partnerSysMac;
    private final int partnerPortPriority;
    private final int partnerPortNum;
    private final int partnerKey;
//
    // Immutable default instance
    final static OFBsnLacpConvergenceNotifVer13 DEFAULT = new OFBsnLacpConvergenceNotifVer13(
        DEFAULT_XID, DEFAULT_CONVERGENCE_STATUS, DEFAULT_PORT_NO, DEFAULT_ACTOR_SYS_PRIORITY, DEFAULT_ACTOR_SYS_MAC, DEFAULT_ACTOR_PORT_PRIORITY, DEFAULT_ACTOR_PORT_NUM, DEFAULT_ACTOR_KEY, DEFAULT_PARTNER_SYS_PRIORITY, DEFAULT_PARTNER_SYS_MAC, DEFAULT_PARTNER_PORT_PRIORITY, DEFAULT_PARTNER_PORT_NUM, DEFAULT_PARTNER_KEY
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnLacpConvergenceNotifVer13(long xid, short convergenceStatus, OFPort portNo, int actorSysPriority, MacAddress actorSysMac, int actorPortPriority, int actorPortNum, int actorKey, int partnerSysPriority, MacAddress partnerSysMac, int partnerPortPriority, int partnerPortNum, int partnerKey) {
        if(portNo == null) {
            throw new NullPointerException("OFBsnLacpConvergenceNotifVer13: property portNo cannot be null");
        }
        if(actorSysMac == null) {
            throw new NullPointerException("OFBsnLacpConvergenceNotifVer13: property actorSysMac cannot be null");
        }
        if(partnerSysMac == null) {
            throw new NullPointerException("OFBsnLacpConvergenceNotifVer13: property partnerSysMac cannot be null");
        }
        this.xid = U32.normalize(xid);
        this.convergenceStatus = U8.normalize(convergenceStatus);
        this.portNo = portNo;
        this.actorSysPriority = U16.normalize(actorSysPriority);
        this.actorSysMac = actorSysMac;
        this.actorPortPriority = U16.normalize(actorPortPriority);
        this.actorPortNum = U16.normalize(actorPortNum);
        this.actorKey = U16.normalize(actorKey);
        this.partnerSysPriority = U16.normalize(partnerSysPriority);
        this.partnerSysMac = partnerSysMac;
        this.partnerPortPriority = U16.normalize(partnerPortPriority);
        this.partnerPortNum = U16.normalize(partnerPortNum);
        this.partnerKey = U16.normalize(partnerKey);
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x2bL;
    }

    @Override
    public short getConvergenceStatus() {
        return convergenceStatus;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public int getPartnerSysPriority() {
        return partnerSysPriority;
    }

    @Override
    public MacAddress getPartnerSysMac() {
        return partnerSysMac;
    }

    @Override
    public int getPartnerPortPriority() {
        return partnerPortPriority;
    }

    @Override
    public int getPartnerPortNum() {
        return partnerPortNum;
    }

    @Override
    public int getPartnerKey() {
        return partnerKey;
    }



    public OFBsnLacpConvergenceNotif.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnLacpConvergenceNotif.Builder {
        final OFBsnLacpConvergenceNotifVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean convergenceStatusSet;
        private short convergenceStatus;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean actorSysPrioritySet;
        private int actorSysPriority;
        private boolean actorSysMacSet;
        private MacAddress actorSysMac;
        private boolean actorPortPrioritySet;
        private int actorPortPriority;
        private boolean actorPortNumSet;
        private int actorPortNum;
        private boolean actorKeySet;
        private int actorKey;
        private boolean partnerSysPrioritySet;
        private int partnerSysPriority;
        private boolean partnerSysMacSet;
        private MacAddress partnerSysMac;
        private boolean partnerPortPrioritySet;
        private int partnerPortPriority;
        private boolean partnerPortNumSet;
        private int partnerPortNum;
        private boolean partnerKeySet;
        private int partnerKey;

        BuilderWithParent(OFBsnLacpConvergenceNotifVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x2bL;
    }

    @Override
    public short getConvergenceStatus() {
        return convergenceStatus;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setConvergenceStatus(short convergenceStatus) {
        this.convergenceStatus = convergenceStatus;
        this.convergenceStatusSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorSysPriority(int actorSysPriority) {
        this.actorSysPriority = actorSysPriority;
        this.actorSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorSysMac(MacAddress actorSysMac) {
        this.actorSysMac = actorSysMac;
        this.actorSysMacSet = true;
        return this;
    }
    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorPortPriority(int actorPortPriority) {
        this.actorPortPriority = actorPortPriority;
        this.actorPortPrioritySet = true;
        return this;
    }
    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorPortNum(int actorPortNum) {
        this.actorPortNum = actorPortNum;
        this.actorPortNumSet = true;
        return this;
    }
    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorKey(int actorKey) {
        this.actorKey = actorKey;
        this.actorKeySet = true;
        return this;
    }
    @Override
    public int getPartnerSysPriority() {
        return partnerSysPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerSysPriority(int partnerSysPriority) {
        this.partnerSysPriority = partnerSysPriority;
        this.partnerSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getPartnerSysMac() {
        return partnerSysMac;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerSysMac(MacAddress partnerSysMac) {
        this.partnerSysMac = partnerSysMac;
        this.partnerSysMacSet = true;
        return this;
    }
    @Override
    public int getPartnerPortPriority() {
        return partnerPortPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerPortPriority(int partnerPortPriority) {
        this.partnerPortPriority = partnerPortPriority;
        this.partnerPortPrioritySet = true;
        return this;
    }
    @Override
    public int getPartnerPortNum() {
        return partnerPortNum;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerPortNum(int partnerPortNum) {
        this.partnerPortNum = partnerPortNum;
        this.partnerPortNumSet = true;
        return this;
    }
    @Override
    public int getPartnerKey() {
        return partnerKey;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerKey(int partnerKey) {
        this.partnerKey = partnerKey;
        this.partnerKeySet = true;
        return this;
    }


        @Override
        public OFBsnLacpConvergenceNotif build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                short convergenceStatus = this.convergenceStatusSet ? this.convergenceStatus : parentMessage.convergenceStatus;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                int actorSysPriority = this.actorSysPrioritySet ? this.actorSysPriority : parentMessage.actorSysPriority;
                MacAddress actorSysMac = this.actorSysMacSet ? this.actorSysMac : parentMessage.actorSysMac;
                if(actorSysMac == null)
                    throw new NullPointerException("Property actorSysMac must not be null");
                int actorPortPriority = this.actorPortPrioritySet ? this.actorPortPriority : parentMessage.actorPortPriority;
                int actorPortNum = this.actorPortNumSet ? this.actorPortNum : parentMessage.actorPortNum;
                int actorKey = this.actorKeySet ? this.actorKey : parentMessage.actorKey;
                int partnerSysPriority = this.partnerSysPrioritySet ? this.partnerSysPriority : parentMessage.partnerSysPriority;
                MacAddress partnerSysMac = this.partnerSysMacSet ? this.partnerSysMac : parentMessage.partnerSysMac;
                if(partnerSysMac == null)
                    throw new NullPointerException("Property partnerSysMac must not be null");
                int partnerPortPriority = this.partnerPortPrioritySet ? this.partnerPortPriority : parentMessage.partnerPortPriority;
                int partnerPortNum = this.partnerPortNumSet ? this.partnerPortNum : parentMessage.partnerPortNum;
                int partnerKey = this.partnerKeySet ? this.partnerKey : parentMessage.partnerKey;

                //
                return new OFBsnLacpConvergenceNotifVer13(
                    xid,
                    convergenceStatus,
                    portNo,
                    actorSysPriority,
                    actorSysMac,
                    actorPortPriority,
                    actorPortNum,
                    actorKey,
                    partnerSysPriority,
                    partnerSysMac,
                    partnerPortPriority,
                    partnerPortNum,
                    partnerKey
                );
        }

    }

    static class Builder implements OFBsnLacpConvergenceNotif.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean convergenceStatusSet;
        private short convergenceStatus;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean actorSysPrioritySet;
        private int actorSysPriority;
        private boolean actorSysMacSet;
        private MacAddress actorSysMac;
        private boolean actorPortPrioritySet;
        private int actorPortPriority;
        private boolean actorPortNumSet;
        private int actorPortNum;
        private boolean actorKeySet;
        private int actorKey;
        private boolean partnerSysPrioritySet;
        private int partnerSysPriority;
        private boolean partnerSysMacSet;
        private MacAddress partnerSysMac;
        private boolean partnerPortPrioritySet;
        private int partnerPortPriority;
        private boolean partnerPortNumSet;
        private int partnerPortNum;
        private boolean partnerKeySet;
        private int partnerKey;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x2bL;
    }

    @Override
    public short getConvergenceStatus() {
        return convergenceStatus;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setConvergenceStatus(short convergenceStatus) {
        this.convergenceStatus = convergenceStatus;
        this.convergenceStatusSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getActorSysPriority() {
        return actorSysPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorSysPriority(int actorSysPriority) {
        this.actorSysPriority = actorSysPriority;
        this.actorSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getActorSysMac() {
        return actorSysMac;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorSysMac(MacAddress actorSysMac) {
        this.actorSysMac = actorSysMac;
        this.actorSysMacSet = true;
        return this;
    }
    @Override
    public int getActorPortPriority() {
        return actorPortPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorPortPriority(int actorPortPriority) {
        this.actorPortPriority = actorPortPriority;
        this.actorPortPrioritySet = true;
        return this;
    }
    @Override
    public int getActorPortNum() {
        return actorPortNum;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorPortNum(int actorPortNum) {
        this.actorPortNum = actorPortNum;
        this.actorPortNumSet = true;
        return this;
    }
    @Override
    public int getActorKey() {
        return actorKey;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setActorKey(int actorKey) {
        this.actorKey = actorKey;
        this.actorKeySet = true;
        return this;
    }
    @Override
    public int getPartnerSysPriority() {
        return partnerSysPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerSysPriority(int partnerSysPriority) {
        this.partnerSysPriority = partnerSysPriority;
        this.partnerSysPrioritySet = true;
        return this;
    }
    @Override
    public MacAddress getPartnerSysMac() {
        return partnerSysMac;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerSysMac(MacAddress partnerSysMac) {
        this.partnerSysMac = partnerSysMac;
        this.partnerSysMacSet = true;
        return this;
    }
    @Override
    public int getPartnerPortPriority() {
        return partnerPortPriority;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerPortPriority(int partnerPortPriority) {
        this.partnerPortPriority = partnerPortPriority;
        this.partnerPortPrioritySet = true;
        return this;
    }
    @Override
    public int getPartnerPortNum() {
        return partnerPortNum;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerPortNum(int partnerPortNum) {
        this.partnerPortNum = partnerPortNum;
        this.partnerPortNumSet = true;
        return this;
    }
    @Override
    public int getPartnerKey() {
        return partnerKey;
    }

    @Override
    public OFBsnLacpConvergenceNotif.Builder setPartnerKey(int partnerKey) {
        this.partnerKey = partnerKey;
        this.partnerKeySet = true;
        return this;
    }
//
        @Override
        public OFBsnLacpConvergenceNotif build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            short convergenceStatus = this.convergenceStatusSet ? this.convergenceStatus : DEFAULT_CONVERGENCE_STATUS;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            int actorSysPriority = this.actorSysPrioritySet ? this.actorSysPriority : DEFAULT_ACTOR_SYS_PRIORITY;
            MacAddress actorSysMac = this.actorSysMacSet ? this.actorSysMac : DEFAULT_ACTOR_SYS_MAC;
            if(actorSysMac == null)
                throw new NullPointerException("Property actorSysMac must not be null");
            int actorPortPriority = this.actorPortPrioritySet ? this.actorPortPriority : DEFAULT_ACTOR_PORT_PRIORITY;
            int actorPortNum = this.actorPortNumSet ? this.actorPortNum : DEFAULT_ACTOR_PORT_NUM;
            int actorKey = this.actorKeySet ? this.actorKey : DEFAULT_ACTOR_KEY;
            int partnerSysPriority = this.partnerSysPrioritySet ? this.partnerSysPriority : DEFAULT_PARTNER_SYS_PRIORITY;
            MacAddress partnerSysMac = this.partnerSysMacSet ? this.partnerSysMac : DEFAULT_PARTNER_SYS_MAC;
            if(partnerSysMac == null)
                throw new NullPointerException("Property partnerSysMac must not be null");
            int partnerPortPriority = this.partnerPortPrioritySet ? this.partnerPortPriority : DEFAULT_PARTNER_PORT_PRIORITY;
            int partnerPortNum = this.partnerPortNumSet ? this.partnerPortNum : DEFAULT_PARTNER_PORT_NUM;
            int partnerKey = this.partnerKeySet ? this.partnerKey : DEFAULT_PARTNER_KEY;


            return new OFBsnLacpConvergenceNotifVer13(
                    xid,
                    convergenceStatus,
                    portNo,
                    actorSysPriority,
                    actorSysMac,
                    actorPortPriority,
                    actorPortNum,
                    actorKey,
                    partnerSysPriority,
                    partnerSysMac,
                    partnerPortPriority,
                    partnerPortNum,
                    partnerKey
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnLacpConvergenceNotif> {
        @Override
        public OFBsnLacpConvergenceNotif readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 52)
                throw new OFParseError("Wrong length: Expected=52(52), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x2bL
            int subtype = bb.readInt();
            if(subtype != 0x2b)
                throw new OFParseError("Wrong subtype: Expected=0x2bL(0x2bL), got="+subtype);
            short convergenceStatus = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            OFPort portNo = OFPort.read4Bytes(bb);
            int actorSysPriority = U16.f(bb.readShort());
            MacAddress actorSysMac = MacAddress.read6Bytes(bb);
            int actorPortPriority = U16.f(bb.readShort());
            int actorPortNum = U16.f(bb.readShort());
            int actorKey = U16.f(bb.readShort());
            int partnerSysPriority = U16.f(bb.readShort());
            MacAddress partnerSysMac = MacAddress.read6Bytes(bb);
            int partnerPortPriority = U16.f(bb.readShort());
            int partnerPortNum = U16.f(bb.readShort());
            int partnerKey = U16.f(bb.readShort());

            OFBsnLacpConvergenceNotifVer13 bsnLacpConvergenceNotifVer13 = new OFBsnLacpConvergenceNotifVer13(
                    xid,
                      convergenceStatus,
                      portNo,
                      actorSysPriority,
                      actorSysMac,
                      actorPortPriority,
                      actorPortNum,
                      actorKey,
                      partnerSysPriority,
                      partnerSysMac,
                      partnerPortPriority,
                      partnerPortNum,
                      partnerKey
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnLacpConvergenceNotifVer13);
            return bsnLacpConvergenceNotifVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnLacpConvergenceNotifVer13Funnel FUNNEL = new OFBsnLacpConvergenceNotifVer13Funnel();
    static class OFBsnLacpConvergenceNotifVer13Funnel implements Funnel<OFBsnLacpConvergenceNotifVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnLacpConvergenceNotifVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 52
            sink.putShort((short) 0x34);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x2bL
            sink.putInt(0x2b);
            sink.putShort(message.convergenceStatus);
            // skip pad (3 bytes)
            message.portNo.putTo(sink);
            sink.putInt(message.actorSysPriority);
            message.actorSysMac.putTo(sink);
            sink.putInt(message.actorPortPriority);
            sink.putInt(message.actorPortNum);
            sink.putInt(message.actorKey);
            sink.putInt(message.partnerSysPriority);
            message.partnerSysMac.putTo(sink);
            sink.putInt(message.partnerPortPriority);
            sink.putInt(message.partnerPortNum);
            sink.putInt(message.partnerKey);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnLacpConvergenceNotifVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnLacpConvergenceNotifVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 52
            bb.writeShort((short) 0x34);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x2bL
            bb.writeInt(0x2b);
            bb.writeByte(U8.t(message.convergenceStatus));
            // pad: 3 bytes
            bb.writeZero(3);
            message.portNo.write4Bytes(bb);
            bb.writeShort(U16.t(message.actorSysPriority));
            message.actorSysMac.write6Bytes(bb);
            bb.writeShort(U16.t(message.actorPortPriority));
            bb.writeShort(U16.t(message.actorPortNum));
            bb.writeShort(U16.t(message.actorKey));
            bb.writeShort(U16.t(message.partnerSysPriority));
            message.partnerSysMac.write6Bytes(bb);
            bb.writeShort(U16.t(message.partnerPortPriority));
            bb.writeShort(U16.t(message.partnerPortNum));
            bb.writeShort(U16.t(message.partnerKey));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnLacpConvergenceNotifVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("convergenceStatus=").append(convergenceStatus);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("actorSysPriority=").append(actorSysPriority);
        b.append(", ");
        b.append("actorSysMac=").append(actorSysMac);
        b.append(", ");
        b.append("actorPortPriority=").append(actorPortPriority);
        b.append(", ");
        b.append("actorPortNum=").append(actorPortNum);
        b.append(", ");
        b.append("actorKey=").append(actorKey);
        b.append(", ");
        b.append("partnerSysPriority=").append(partnerSysPriority);
        b.append(", ");
        b.append("partnerSysMac=").append(partnerSysMac);
        b.append(", ");
        b.append("partnerPortPriority=").append(partnerPortPriority);
        b.append(", ");
        b.append("partnerPortNum=").append(partnerPortNum);
        b.append(", ");
        b.append("partnerKey=").append(partnerKey);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnLacpConvergenceNotifVer13 other = (OFBsnLacpConvergenceNotifVer13) obj;

        if( xid != other.xid)
            return false;
        if( convergenceStatus != other.convergenceStatus)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( actorSysPriority != other.actorSysPriority)
            return false;
        if (actorSysMac == null) {
            if (other.actorSysMac != null)
                return false;
        } else if (!actorSysMac.equals(other.actorSysMac))
            return false;
        if( actorPortPriority != other.actorPortPriority)
            return false;
        if( actorPortNum != other.actorPortNum)
            return false;
        if( actorKey != other.actorKey)
            return false;
        if( partnerSysPriority != other.partnerSysPriority)
            return false;
        if (partnerSysMac == null) {
            if (other.partnerSysMac != null)
                return false;
        } else if (!partnerSysMac.equals(other.partnerSysMac))
            return false;
        if( partnerPortPriority != other.partnerPortPriority)
            return false;
        if( partnerPortNum != other.partnerPortNum)
            return false;
        if( partnerKey != other.partnerKey)
            return false;
        return true;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnLacpConvergenceNotifVer13 other = (OFBsnLacpConvergenceNotifVer13) obj;

        // ignore XID
        if( convergenceStatus != other.convergenceStatus)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( actorSysPriority != other.actorSysPriority)
            return false;
        if (actorSysMac == null) {
            if (other.actorSysMac != null)
                return false;
        } else if (!actorSysMac.equals(other.actorSysMac))
            return false;
        if( actorPortPriority != other.actorPortPriority)
            return false;
        if( actorPortNum != other.actorPortNum)
            return false;
        if( actorKey != other.actorKey)
            return false;
        if( partnerSysPriority != other.partnerSysPriority)
            return false;
        if (partnerSysMac == null) {
            if (other.partnerSysMac != null)
                return false;
        } else if (!partnerSysMac.equals(other.partnerSysMac))
            return false;
        if( partnerPortPriority != other.partnerPortPriority)
            return false;
        if( partnerPortNum != other.partnerPortNum)
            return false;
        if( partnerKey != other.partnerKey)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + convergenceStatus;
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + actorSysPriority;
        result = prime * result + ((actorSysMac == null) ? 0 : actorSysMac.hashCode());
        result = prime * result + actorPortPriority;
        result = prime * result + actorPortNum;
        result = prime * result + actorKey;
        result = prime * result + partnerSysPriority;
        result = prime * result + ((partnerSysMac == null) ? 0 : partnerSysMac.hashCode());
        result = prime * result + partnerPortPriority;
        result = prime * result + partnerPortNum;
        result = prime * result + partnerKey;
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + convergenceStatus;
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + actorSysPriority;
        result = prime * result + ((actorSysMac == null) ? 0 : actorSysMac.hashCode());
        result = prime * result + actorPortPriority;
        result = prime * result + actorPortNum;
        result = prime * result + actorKey;
        result = prime * result + partnerSysPriority;
        result = prime * result + ((partnerSysMac == null) ? 0 : partnerSysMac.hashCode());
        result = prime * result + partnerPortPriority;
        result = prime * result + partnerPortNum;
        result = prime * result + partnerKey;
        return result;
    }

}
