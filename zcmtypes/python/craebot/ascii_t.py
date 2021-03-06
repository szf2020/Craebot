"""ZCM type definitions
This file automatically generated by zcm.
DO NOT MODIFY BY HAND!!!!
"""

try:
    import cStringIO.StringIO as BytesIO
except ImportError:
    from io import BytesIO
import struct

class ascii_t(object):
    __slots__ = ["utime", "nCharacters", "data"]

    def __init__(self):
        self.utime = 0
        self.nCharacters = 0
        self.data = ""

    def encode(self):
        buf = BytesIO()
        buf.write(ascii_t._get_packed_fingerprint())
        self._encode_one(buf)
        return buf.getvalue()

    def _encode_one(self, buf):
        buf.write(struct.pack(">qb", self.utime, self.nCharacters))
        buf.write(bytearray(self.data[:self.nCharacters]))

    def decode(data):
        if hasattr(data, 'read'):
            buf = data
        else:
            buf = BytesIO(data)
        if buf.read(8) != ascii_t._get_packed_fingerprint():
            raise ValueError("Decode error")
        return ascii_t._decode_one(buf)
    decode = staticmethod(decode)

    def _decode_one(buf):
        self = ascii_t()
        self.utime, self.nCharacters = struct.unpack(">qb", buf.read(9))
        self.data = buf.read(self.nCharacters)
        return self
    _decode_one = staticmethod(_decode_one)

    _hash = None
    def _get_hash_recursive(parents):
        if ascii_t in parents: return 0
        tmphash = (0x3492a7eec17bf24c) & 0xffffffffffffffff
        tmphash  = (((tmphash<<1)&0xffffffffffffffff)  + ((tmphash>>63)&0x1)) & 0xffffffffffffffff
        return tmphash
    _get_hash_recursive = staticmethod(_get_hash_recursive)
    _packed_fingerprint = None

    def _get_packed_fingerprint():
        if ascii_t._packed_fingerprint is None:
            ascii_t._packed_fingerprint = struct.pack(">Q", ascii_t._get_hash_recursive([]))
        return ascii_t._packed_fingerprint
    _get_packed_fingerprint = staticmethod(_get_packed_fingerprint)

