package tests

import (
	"github.com/leetcode/questions"
	"gotest.tools/assert"
	"testing"
)

func TestMoveZeroes(t *testing.T) {
	input := []int{0, 1, 0, 3, 12}
	expected := []int{1, 3, 12, 0, 0}
	questions.MoveZeroes(input)
	for idx, val := range expected {
		assert.Equal(t, val, input[idx])
	}
}
