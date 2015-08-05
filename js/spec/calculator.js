describe('calculator', function() {
  describe('add()', function() {
    it('should add 2 numbers together', function() {
      expect(calculator.add(1, 4)).toEqual(5);
    });
  });
});
