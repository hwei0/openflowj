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
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFFlowStatsEntryVer13 implements OFFlowStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFFlowStatsEntryVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 56;
    // maximum OF message length: 16 bit, unsigned
    final static int MAXIMUM_LENGTH = 0xFFFF;

        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static long DEFAULT_DURATION_SEC = 0x0L;
        private final static long DEFAULT_DURATION_NSEC = 0x0L;
        private final static int DEFAULT_PRIORITY = 0x0;
        private final static int DEFAULT_IDLE_TIMEOUT = 0x0;
        private final static int DEFAULT_HARD_TIMEOUT = 0x0;
        private final static Set<OFFlowModFlags> DEFAULT_FLAGS = ImmutableSet.<OFFlowModFlags>of();
        private final static U64 DEFAULT_COOKIE = U64.ZERO;
        private final static U64 DEFAULT_PACKET_COUNT = U64.ZERO;
        private final static U64 DEFAULT_BYTE_COUNT = U64.ZERO;
        private final static Match DEFAULT_MATCH = OFFactoryVer13.MATCH_WILDCARD_ALL;
        private final static List<OFInstruction> DEFAULT_INSTRUCTIONS = ImmutableList.<OFInstruction>of();

    // OF message fields
    private final TableId tableId;
    private final long durationSec;
    private final long durationNsec;
    private final int priority;
    private final int idleTimeout;
    private final int hardTimeout;
    private final Set<OFFlowModFlags> flags;
    private final U64 cookie;
    private final U64 packetCount;
    private final U64 byteCount;
    private final Match match;
    private final List<OFInstruction> instructions;
//
    // Immutable default instance
    final static OFFlowStatsEntryVer13 DEFAULT = new OFFlowStatsEntryVer13(
        DEFAULT_TABLE_ID, DEFAULT_DURATION_SEC, DEFAULT_DURATION_NSEC, DEFAULT_PRIORITY, DEFAULT_IDLE_TIMEOUT, DEFAULT_HARD_TIMEOUT, DEFAULT_FLAGS, DEFAULT_COOKIE, DEFAULT_PACKET_COUNT, DEFAULT_BYTE_COUNT, DEFAULT_MATCH, DEFAULT_INSTRUCTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFFlowStatsEntryVer13(TableId tableId, long durationSec, long durationNsec, int priority, int idleTimeout, int hardTimeout, Set<OFFlowModFlags> flags, U64 cookie, U64 packetCount, U64 byteCount, Match match, List<OFInstruction> instructions) {
        if(tableId == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property tableId cannot be null");
        }
        if(flags == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property flags cannot be null");
        }
        if(cookie == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property cookie cannot be null");
        }
        if(packetCount == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property packetCount cannot be null");
        }
        if(byteCount == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property byteCount cannot be null");
        }
        if(match == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property match cannot be null");
        }
        if(instructions == null) {
            throw new NullPointerException("OFFlowStatsEntryVer13: property instructions cannot be null");
        }
        this.tableId = tableId;
        this.durationSec = U32.normalize(durationSec);
        this.durationNsec = U32.normalize(durationNsec);
        this.priority = U16.normalize(priority);
        this.idleTimeout = U16.normalize(idleTimeout);
        this.hardTimeout = U16.normalize(hardTimeout);
        this.flags = flags;
        this.cookie = cookie;
        this.packetCount = packetCount;
        this.byteCount = byteCount;
        this.match = match;
        this.instructions = instructions;
    }

    // Accessors for OF message fields
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public List<OFAction> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.3");
    }

    @Override
    public List<OFInstruction> getInstructions() {
        return instructions;
    }

    @Override
    public Set<OFFlowModFlags> getFlags() {
        return flags;
    }

    @Override
    public int getImportance()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property importance not supported in version 1.3");
    }

    @Override
    public Stat getStats()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property stats not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFFlowStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFlowStatsEntry.Builder {
        final OFFlowStatsEntryVer13 parentMessage;

        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean durationSecSet;
        private long durationSec;
        private boolean durationNsecSet;
        private long durationNsec;
        private boolean prioritySet;
        private int priority;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean flagsSet;
        private Set<OFFlowModFlags> flags;
        private boolean cookieSet;
        private U64 cookie;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean matchSet;
        private Match match;
        private boolean instructionsSet;
        private List<OFInstruction> instructions;

        BuilderWithParent(OFFlowStatsEntryVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowStatsEntry.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationSec(long durationSec) {
        this.durationSec = durationSec;
        this.durationSecSet = true;
        return this;
    }
    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationNsec(long durationNsec) {
        this.durationNsec = durationNsec;
        this.durationNsecSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowStatsEntry.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFFlowStatsEntry.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public List<OFAction> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.3");
    }

    @Override
    public OFFlowStatsEntry.Builder setActions(List<OFAction> actions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property actions not supported in version 1.3");
    }
    @Override
    public List<OFInstruction> getInstructions() {
        return instructions;
    }

    @Override
    public OFFlowStatsEntry.Builder setInstructions(List<OFInstruction> instructions) {
        this.instructions = instructions;
        this.instructionsSet = true;
        return this;
    }
    @Override
    public Set<OFFlowModFlags> getFlags() {
        return flags;
    }

    @Override
    public OFFlowStatsEntry.Builder setFlags(Set<OFFlowModFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public int getImportance()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property importance not supported in version 1.3");
    }

    @Override
    public OFFlowStatsEntry.Builder setImportance(int importance) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property importance not supported in version 1.3");
    }
    @Override
    public Stat getStats()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property stats not supported in version 1.3");
    }

    @Override
    public OFFlowStatsEntry.Builder setStats(Stat stats) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property stats not supported in version 1.3");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFFlowStatsEntry build() {
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                long durationSec = this.durationSecSet ? this.durationSec : parentMessage.durationSec;
                long durationNsec = this.durationNsecSet ? this.durationNsec : parentMessage.durationNsec;
                int priority = this.prioritySet ? this.priority : parentMessage.priority;
                int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : parentMessage.idleTimeout;
                int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : parentMessage.hardTimeout;
                Set<OFFlowModFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                U64 cookie = this.cookieSet ? this.cookie : parentMessage.cookie;
                if(cookie == null)
                    throw new NullPointerException("Property cookie must not be null");
                U64 packetCount = this.packetCountSet ? this.packetCount : parentMessage.packetCount;
                if(packetCount == null)
                    throw new NullPointerException("Property packetCount must not be null");
                U64 byteCount = this.byteCountSet ? this.byteCount : parentMessage.byteCount;
                if(byteCount == null)
                    throw new NullPointerException("Property byteCount must not be null");
                Match match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");
                List<OFInstruction> instructions = this.instructionsSet ? this.instructions : parentMessage.instructions;
                if(instructions == null)
                    throw new NullPointerException("Property instructions must not be null");

                //
                return new OFFlowStatsEntryVer13(
                    tableId,
                    durationSec,
                    durationNsec,
                    priority,
                    idleTimeout,
                    hardTimeout,
                    flags,
                    cookie,
                    packetCount,
                    byteCount,
                    match,
                    instructions
                );
        }

    }

    static class Builder implements OFFlowStatsEntry.Builder {
        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean durationSecSet;
        private long durationSec;
        private boolean durationNsecSet;
        private long durationNsec;
        private boolean prioritySet;
        private int priority;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean flagsSet;
        private Set<OFFlowModFlags> flags;
        private boolean cookieSet;
        private U64 cookie;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean matchSet;
        private Match match;
        private boolean instructionsSet;
        private List<OFInstruction> instructions;

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFFlowStatsEntry.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowStatsEntry.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationSec(long durationSec) {
        this.durationSec = durationSec;
        this.durationSecSet = true;
        return this;
    }
    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public OFFlowStatsEntry.Builder setDurationNsec(long durationNsec) {
        this.durationNsec = durationNsec;
        this.durationNsecSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowStatsEntry.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFFlowStatsEntry.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFFlowStatsEntry.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFFlowStatsEntry.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public List<OFAction> getActions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property actions not supported in version 1.3");
    }

    @Override
    public OFFlowStatsEntry.Builder setActions(List<OFAction> actions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property actions not supported in version 1.3");
    }
    @Override
    public List<OFInstruction> getInstructions() {
        return instructions;
    }

    @Override
    public OFFlowStatsEntry.Builder setInstructions(List<OFInstruction> instructions) {
        this.instructions = instructions;
        this.instructionsSet = true;
        return this;
    }
    @Override
    public Set<OFFlowModFlags> getFlags() {
        return flags;
    }

    @Override
    public OFFlowStatsEntry.Builder setFlags(Set<OFFlowModFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public int getImportance()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property importance not supported in version 1.3");
    }

    @Override
    public OFFlowStatsEntry.Builder setImportance(int importance) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property importance not supported in version 1.3");
    }
    @Override
    public Stat getStats()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property stats not supported in version 1.3");
    }

    @Override
    public OFFlowStatsEntry.Builder setStats(Stat stats) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property stats not supported in version 1.3");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFFlowStatsEntry build() {
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            long durationSec = this.durationSecSet ? this.durationSec : DEFAULT_DURATION_SEC;
            long durationNsec = this.durationNsecSet ? this.durationNsec : DEFAULT_DURATION_NSEC;
            int priority = this.prioritySet ? this.priority : DEFAULT_PRIORITY;
            int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : DEFAULT_IDLE_TIMEOUT;
            int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : DEFAULT_HARD_TIMEOUT;
            Set<OFFlowModFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            U64 cookie = this.cookieSet ? this.cookie : DEFAULT_COOKIE;
            if(cookie == null)
                throw new NullPointerException("Property cookie must not be null");
            U64 packetCount = this.packetCountSet ? this.packetCount : DEFAULT_PACKET_COUNT;
            if(packetCount == null)
                throw new NullPointerException("Property packetCount must not be null");
            U64 byteCount = this.byteCountSet ? this.byteCount : DEFAULT_BYTE_COUNT;
            if(byteCount == null)
                throw new NullPointerException("Property byteCount must not be null");
            Match match = this.matchSet ? this.match : DEFAULT_MATCH;
            if(match == null)
                throw new NullPointerException("Property match must not be null");
            List<OFInstruction> instructions = this.instructionsSet ? this.instructions : DEFAULT_INSTRUCTIONS;
            if(instructions == null)
                throw new NullPointerException("Property instructions must not be null");


            return new OFFlowStatsEntryVer13(
                    tableId,
                    durationSec,
                    durationNsec,
                    priority,
                    idleTimeout,
                    hardTimeout,
                    flags,
                    cookie,
                    packetCount,
                    byteCount,
                    match,
                    instructions
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFFlowStatsEntry> {
        @Override
        public OFFlowStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            TableId tableId = TableId.readByte(bb);
            // pad: 1 bytes
            bb.skipBytes(1);
            long durationSec = U32.f(bb.readInt());
            long durationNsec = U32.f(bb.readInt());
            int priority = U16.f(bb.readShort());
            int idleTimeout = U16.f(bb.readShort());
            int hardTimeout = U16.f(bb.readShort());
            Set<OFFlowModFlags> flags = OFFlowModFlagsSerializerVer13.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            U64 cookie = U64.ofRaw(bb.readLong());
            U64 packetCount = U64.ofRaw(bb.readLong());
            U64 byteCount = U64.ofRaw(bb.readLong());
            Match match = ChannelUtilsVer13.readOFMatch(bb);
            List<OFInstruction> instructions = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFInstructionVer13.READER);

            OFFlowStatsEntryVer13 flowStatsEntryVer13 = new OFFlowStatsEntryVer13(
                    tableId,
                      durationSec,
                      durationNsec,
                      priority,
                      idleTimeout,
                      hardTimeout,
                      flags,
                      cookie,
                      packetCount,
                      byteCount,
                      match,
                      instructions
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", flowStatsEntryVer13);
            return flowStatsEntryVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFlowStatsEntryVer13Funnel FUNNEL = new OFFlowStatsEntryVer13Funnel();
    static class OFFlowStatsEntryVer13Funnel implements Funnel<OFFlowStatsEntryVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFlowStatsEntryVer13 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            message.tableId.putTo(sink);
            // skip pad (1 bytes)
            sink.putLong(message.durationSec);
            sink.putLong(message.durationNsec);
            sink.putInt(message.priority);
            sink.putInt(message.idleTimeout);
            sink.putInt(message.hardTimeout);
            OFFlowModFlagsSerializerVer13.putTo(message.flags, sink);
            // skip pad (4 bytes)
            message.cookie.putTo(sink);
            message.packetCount.putTo(sink);
            message.byteCount.putTo(sink);
            message.match.putTo(sink);
            FunnelUtils.putList(message.instructions, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFlowStatsEntryVer13> {
        @Override
        public void write(ByteBuf bb, OFFlowStatsEntryVer13 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            message.tableId.writeByte(bb);
            // pad: 1 bytes
            bb.writeZero(1);
            bb.writeInt(U32.t(message.durationSec));
            bb.writeInt(U32.t(message.durationNsec));
            bb.writeShort(U16.t(message.priority));
            bb.writeShort(U16.t(message.idleTimeout));
            bb.writeShort(U16.t(message.hardTimeout));
            OFFlowModFlagsSerializerVer13.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeLong(message.cookie.getValue());
            bb.writeLong(message.packetCount.getValue());
            bb.writeLong(message.byteCount.getValue());
            message.match.writeTo(bb);
            ChannelUtils.writeList(bb, message.instructions);

            // update length field
            int length = bb.writerIndex() - startIndex;
            if (length > MAXIMUM_LENGTH) {
                throw new IllegalArgumentException("OFFlowStatsEntryVer13: message length (" + length + ") exceeds maximum (0xFFFF)");
            }
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFlowStatsEntryVer13(");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("durationSec=").append(durationSec);
        b.append(", ");
        b.append("durationNsec=").append(durationNsec);
        b.append(", ");
        b.append("priority=").append(priority);
        b.append(", ");
        b.append("idleTimeout=").append(idleTimeout);
        b.append(", ");
        b.append("hardTimeout=").append(hardTimeout);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("cookie=").append(cookie);
        b.append(", ");
        b.append("packetCount=").append(packetCount);
        b.append(", ");
        b.append("byteCount=").append(byteCount);
        b.append(", ");
        b.append("match=").append(match);
        b.append(", ");
        b.append("instructions=").append(instructions);
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
        OFFlowStatsEntryVer13 other = (OFFlowStatsEntryVer13) obj;

        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if( durationSec != other.durationSec)
            return false;
        if( durationNsec != other.durationNsec)
            return false;
        if( priority != other.priority)
            return false;
        if( idleTimeout != other.idleTimeout)
            return false;
        if( hardTimeout != other.hardTimeout)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        if (packetCount == null) {
            if (other.packetCount != null)
                return false;
        } else if (!packetCount.equals(other.packetCount))
            return false;
        if (byteCount == null) {
            if (other.byteCount != null)
                return false;
        } else if (!byteCount.equals(other.byteCount))
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        if (instructions == null) {
            if (other.instructions != null)
                return false;
        } else if (!instructions.equals(other.instructions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime *  (int) (durationSec ^ (durationSec >>> 32));
        result = prime *  (int) (durationNsec ^ (durationNsec >>> 32));
        result = prime * result + priority;
        result = prime * result + idleTimeout;
        result = prime * result + hardTimeout;
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        result = prime * result + ((packetCount == null) ? 0 : packetCount.hashCode());
        result = prime * result + ((byteCount == null) ? 0 : byteCount.hashCode());
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        result = prime * result + ((instructions == null) ? 0 : instructions.hashCode());
        return result;
    }

}
