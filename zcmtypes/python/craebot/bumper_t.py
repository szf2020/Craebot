"""ZCM type definitions
This file automatically generated by zcm.
DO NOT MODIFY BY HAND!!!!
"""

try:
    import cStringIO.StringIO as BytesIO
except ImportError:
    from io import BytesIO
import struct

class bumper_t(object):
    __slots__ = ["utime", "is_left_pressed", "is_right_pressed", "is_light_left", "is_light_front_left", "is_light_center_left", "is_light_center_right", "is_light_front_right", "is_light_right", "light_signal_left", "light_signal_front_left", "light_signal_center_left", "light_signal_center_right", "light_signal_front_right", "light_signal_right", "omni_ir"]

    def __init__(self):
        self.utime = 0
        self.is_left_pressed = False
        self.is_right_pressed = False
        self.is_light_left = False
        self.is_light_front_left = False
        self.is_light_center_left = False
        self.is_light_center_right = False
        self.is_light_front_right = False
        self.is_light_right = False
        self.light_signal_left = 0
        self.light_signal_front_left = 0
        self.light_signal_center_left = 0
        self.light_signal_center_right = 0
        self.light_signal_front_right = 0
        self.light_signal_right = 0
        self.omni_ir = 0

    def encode(self):
        buf = BytesIO()
        buf.write(bumper_t._get_packed_fingerprint())
        self._encode_one(buf)
        return buf.getvalue()

    def _encode_one(self, buf):
        buf.write(struct.pack(">qbbbbbbbbhhhhhhB", self.utime, self.is_left_pressed, self.is_right_pressed, self.is_light_left, self.is_light_front_left, self.is_light_center_left, self.is_light_center_right, self.is_light_front_right, self.is_light_right, self.light_signal_left, self.light_signal_front_left, self.light_signal_center_left, self.light_signal_center_right, self.light_signal_front_right, self.light_signal_right, self.omni_ir))

    def decode(data):
        if hasattr(data, 'read'):
            buf = data
        else:
            buf = BytesIO(data)
        if buf.read(8) != bumper_t._get_packed_fingerprint():
            raise ValueError("Decode error")
        return bumper_t._decode_one(buf)
    decode = staticmethod(decode)

    def _decode_one(buf):
        self = bumper_t()
        self.utime = struct.unpack(">q", buf.read(8))[0]
        self.is_left_pressed = bool(struct.unpack('b', buf.read(1))[0])
        self.is_right_pressed = bool(struct.unpack('b', buf.read(1))[0])
        self.is_light_left = bool(struct.unpack('b', buf.read(1))[0])
        self.is_light_front_left = bool(struct.unpack('b', buf.read(1))[0])
        self.is_light_center_left = bool(struct.unpack('b', buf.read(1))[0])
        self.is_light_center_right = bool(struct.unpack('b', buf.read(1))[0])
        self.is_light_front_right = bool(struct.unpack('b', buf.read(1))[0])
        self.is_light_right = bool(struct.unpack('b', buf.read(1))[0])
        self.light_signal_left, self.light_signal_front_left, self.light_signal_center_left, self.light_signal_center_right, self.light_signal_front_right, self.light_signal_right, self.omni_ir = struct.unpack(">hhhhhhB", buf.read(13))
        return self
    _decode_one = staticmethod(_decode_one)

    _hash = None
    def _get_hash_recursive(parents):
        if bumper_t in parents: return 0
        tmphash = (0x9aba7df6329379d0) & 0xffffffffffffffff
        tmphash  = (((tmphash<<1)&0xffffffffffffffff)  + ((tmphash>>63)&0x1)) & 0xffffffffffffffff
        return tmphash
    _get_hash_recursive = staticmethod(_get_hash_recursive)
    _packed_fingerprint = None

    def _get_packed_fingerprint():
        if bumper_t._packed_fingerprint is None:
            bumper_t._packed_fingerprint = struct.pack(">Q", bumper_t._get_hash_recursive([]))
        return bumper_t._packed_fingerprint
    _get_packed_fingerprint = staticmethod(_get_packed_fingerprint)
